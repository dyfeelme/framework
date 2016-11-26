package com.zs.biz.drools.service;

import com.zs.biz.drools.domain.*;
import org.drools.FactHandle;
import org.drools.KnowledgeBase;
import org.drools.ObjectFilter;
import org.drools.command.Command;
import org.drools.command.CommandFactory;
import org.drools.definition.type.FactType;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DroolsServiceUtil
{
  @Value("#{ksession}")
  private StatefulKnowledgeSession ksession;
            
  @Async
  public void fireRulesUtilHalt()
  {
    try{
      getKsession().fireUntilHalt(); 
    }catch(ConsequenceException e) 
    {
      throw e;
    }
  }
   
  public void initializeKnowledgeSession()
  {  
    getKsession().setGlobal("droolsServiceUtil", this);
    syncFactsWithDatabase();
  }

  @Transactional //a transaction-scoped persistence context
  public void syncFactsWithDatabase()
  {
    synchronized(ksession)
    {       
      // Reset all the facts in the working memory
      Collection<FactHandle> factHandles = getKsession().getFactHandles(
        new ObjectFilter(){public boolean accept(Object object)
        {
          if(object instanceof MemberCase)
            return true;
          return false;
        }
      });
      for(FactHandle factHandle : factHandles)
      {
        getKsession().retract(factHandle);
      }

      factHandles = getKsession().getFactHandles(
        new ObjectFilter(){public boolean accept(Object object)
        {
          if(object instanceof Clinician)
            return true;
          return false;
        }
      });
      for(FactHandle factHandle : factHandles)
      {
        getKsession().retract(factHandle);
      }           

      WorkingMemoryEntryPoint entryPoint = getKsession()
        .getWorkingMemoryEntryPoint("SupervisionStream");
      factHandles = entryPoint.getFactHandles();
      for(FactHandle factHandle : factHandles)
      {
        entryPoint.retract(factHandle);
      }               

      List<Command> commands = new ArrayList<Command>();
      commands.add(CommandFactory.newInsertElements(getMemberCaseService().findAll()));
      getKsession().execute(CommandFactory.newBatchExecution(commands));

      commands = new ArrayList<Command>();
      commands.add(CommandFactory.newInsertElements(getClinicianService().findAll()));
      getKsession().execute(CommandFactory.newBatchExecution(commands));    
	 
      for(CaseSupervision caseSupervision : getCaseSupervisionService().findAll())
      {
        entryPoint.insert(caseSupervision);
      }  
           
    }
  }
 
  public <T> Collection<T> droolsQuery(String query, String variable, 
    Class<T> c, Object... args)
  {
    synchronized(ksession)
    {       
      Collection<T> results = new ArrayList<T>();
      QueryResults qResults = getKsession().getQueryResults(query, args);  
      for(QueryResultsRow qrr : qResults)
      {
        T result = (T) qrr.get("$"+variable);
        results.add(result);
      }       
      return results;
    }
  }
}  
package com.zs.biz.drools.domain;

import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import org.drools.runtime.rule.FactHandle;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.WorkingMemoryEntryPoint;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowire; 

@Configurable
public class DefaultWorkingMemoryPartitionEntityListener 
{
  @Value("#{ksession}") //unable to make @Configurable with compile time weaving work here
  private StatefulKnowledgeSession ksession;   
   
  @PostPersist
  @PostUpdate
  public void updateFact(Object entity)
  {       
    FactHandle factHandle = getKsession().getFactHandle(entity);
    if(factHandle == null)
      getKsession().insert(entity);
    else
      getKsession().update(factHandle, entity);
  }        
		   
  @PostRemove
  public void retractFact(Object entity)
  {
    FactHandle factHandle = getKsession().getFactHandle(entity);
    if(factHandle != null)
      getKsession().retract(factHandle);
  }
 
  public StatefulKnowledgeSession getKsession() 
  {
    if(ksession != null)
    {
      return ksession;
    }
    else
    {
      // a workaround for @Configurable
      setKsession(ApplicationContextProvider.getApplicationContext()
        .getBean("ksession", StatefulKnowledgeSession.class));
      return ksession;
    }
  }
  //...
}
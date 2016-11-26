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
public class SupervisionStreamWorkingMemoryPartitionEntityListener
{ 
  @Value("#{ksession}")  
  private StatefulKnowledgeSession ksession;   
	
  @PostPersist 
  // CaseSupervision is an immutable event, 
  // thus we don�t provide @PostUpdate and @PostRemove implementations.
  public void insertFact(Object entity)
  {   
    WorkingMemoryEntryPoint entryPoint = getKsession()
      .getWorkingMemoryEntryPoint("SupervisionStream");
    entryPoint.insert(entity);
  }        
  //...
}
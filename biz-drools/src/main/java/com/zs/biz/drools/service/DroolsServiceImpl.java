package com.zs.biz.drools.service;

import com.zs.biz.drools.domain.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("droolsService")
@Lazy(false)
@Transactional
public class DroolsServiceImpl 
{
  @Value("#{droolsServiceUtil}")
  private DroolsServiceUtil droolsServiceUtil;
    
  @PostConstruct
  public void launchRules()
  {
    droolsServiceUtil.initializeKnowledgeSession();
    droolsServiceUtil.fireRulesUtilHalt();    
  }
   
  public Collection<TransientReminder> findCaseReminders()
  {
    return droolsServiceUtil.droolsQuery("CaseReminderQuery", 
      "caseReminder", TransientReminder.class, null);
  }
   
  public Collection<TransientReminder> findClinicianReminders()
  {
    return droolsServiceUtil.droolsQuery("ClinicianReminderQuery", 
      "clinicianReminder", TransientReminder.class, null);
  }
}  
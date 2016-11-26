package com.zs.biz.drools.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity
@EntityListeners({DefaultWorkingMemoryPartitionEntityListener.class})
public class Clinician implements Serializable 
{ 
  private Long id; // pk
  private Boolean active;
  private List<CaseSupervision> caseSupervisions = new ArrayList<CaseSupervision>();
	//...
}
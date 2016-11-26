package com.zs.biz.drools.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity
@EntityListeners({DefaultWorkingMemoryPartitionEntityListener.class})
public class MemberCase implements Serializable 
{
  private Long id; // pk
  private Date startDtm;
  private Date endDtm;
  private Member member; // not null (memberId)
  private List<CaseSupervision> caseSupervisions = new ArrayList<CaseSupervision>();
  //...
}
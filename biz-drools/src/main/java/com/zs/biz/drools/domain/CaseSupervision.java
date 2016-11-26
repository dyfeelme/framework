package com.zs.biz.drools.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity
@EntityListeners({SupervisionStreamWorkingMemoryPartitionEntityListener.class})
public class CaseSupervision implements Serializable 
{ 
  private Long id; // pk
  private Date entryDtm;
  private MemberCase memberCase;
  private Clinician clinician;
  //...
}
package com.zs.biz.drools.domain;

import java.io.Serializable;

public class TransientReminder implements Comparable, Serializable
{			
  private MemberCase memberCase;
  private Clinician clinician;
  private String reminderTypeCd;
  private String description;

  public String toString() 
  {
    return ReflectionToStringBuilder.toString(this);
  }

  public boolean equals(Object pObject) 
  {
    return EqualsBuilder.reflectionEquals(this, pObject);
  }

  public int compareTo(Object pObject) 
  {
    return CompareToBuilder.reflectionCompare(this, pObject);
  }

  public int hashCode() 
  {
    return HashCodeBuilder.reflectionHashCode(this);
  } 	
}
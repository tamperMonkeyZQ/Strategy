package com.sut.strategy.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TE_Project",schema = "dbo")
public class TeProjectEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "zxh")
  private String zxh;

  @Column(name = "fxh")
  private String fxh;

  @Column(name = "domainid")
  private String domainId;

  @Column(name = "domain")
  private String domain;

  @Column(name = "industryid")
  private String industryId;

  @Column(name = "industry")
  private String industry;

  @Column(name = "domainattrid")
  private String domainAttrId;

  @Column(name = "domainattr")
  private String domainAttr;

  @Column(name = "requireattrid")
  private String requireAttrId;

  @Column(name = "requireattr")
  private String requireAttr;

  @Column(name = "strategyid")
  private String strategyId;

  @Column(name = "strategy")
  private String strategy;

  @Column(name = "locationid")
  private String locationId;

  @Column(name = "location")
  private String location;

  @Column(name = "domainname")
  private String domainName;

  @Column(name = "benchmark")
  private String benchMark;

  @Column(name = "company")
  private String company;

  @Column(name = "companysummary")
  private String companySummary;

  @Column(name = "projectname")
  private String projectName;

  @Column(name = "projectrequire")
  private String projectRequire;

  @Column(name = "begintime")
  private java.sql.Date beginTime;

  @Column(name = "endtime")
  private java.sql.Date endTime;

  @Column(name = "ccpname")
  private String ccpName;

  @Column(name = "ccpposition")
  private String ccpPosition;

  @Column(name = "ccptel")
  private String ccpTel;

  @Column(name = "ccpmobile")
  private String ccpMobile;

  @Column(name = "ccpemail")
  private String ccpEmail;

  @Column(name = "ccpfax")
  private String ccpFax;

  @Column(name = "check_id")
  private String checkId;

  @Column(name = "check_idm")
  private String checkIdm;

  @Column(name = "submituserid")
  private long submitUserId;

  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(name = "submittime")
  private java.sql.Date submitTime;


}

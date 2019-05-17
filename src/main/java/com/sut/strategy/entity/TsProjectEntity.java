package com.sut.strategy.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TS_Project",schema = "dbo")
public class TsProjectEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "projid")
  private long projId;

  @Column(name = "vid")
  private String vid;

  @Column(name = "domainid")
  private String domainId;

  @Column(name = "industryid")
  private String industryId;

  @Column(name = "domainattrid")
  private String domainAttrId;

  @Column(name = "requireattrid")
  private String requireAttrId;

  @Column(name = "strategyid")
  private String strategyId;

  @Column(name = "locationid")
  private String locationId;

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

  @Column(name = "completion")
  private String completion;

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

  @Column(name = "submittime")
  private java.sql.Date submitTime;

  @Column(name = "submituserid")
  private long submitUserId;

  @Column(name = "state")
  private String state;

  @Column(name = "iscoop")
  private String isCoop;

  @Column(name = "cancletime")
  private java.sql.Date cancleTime;

  @Column(name = "cancleuserid")
  private Long cancleUserId;


}

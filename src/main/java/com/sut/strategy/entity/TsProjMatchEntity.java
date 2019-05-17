package com.sut.strategy.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TS_ProjMatch",schema = "dbo")
public class TsProjMatchEntity implements Serializable{

  @Id
  @Column(name = "projid")
  private long projId;

  @Column(name = "orgid")
  private String orgId;

  @Column(name = "ocpname")
  private String ocpName;

  @Column(name = "cpposition")
  private String cpPosition;

  @Column(name = "cptel")
  private String cpTel;

  @Column(name = "cpmobile")
  private String cpMobile;

  @Column(name = "cpemail")
  private String cpEmail;

  @Column(name = "cpfax")
  private String cpFax;

  @Column(name = "matchtime")
  private java.sql.Date matchTime;

  @Column(name = "matchuserid")
  private long matchUserId;

  @Column(name = "role")
  private String role;

  @Column(name = "roleweight")
  private double roleWeight;

  @Column(name = "perfscore")
  private double perfScore;

  @Column(name = "perfreward")
  private double perfReward;


}

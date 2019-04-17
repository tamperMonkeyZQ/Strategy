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
@Table(name = "TS_ProjWork",schema = "dbo")
public class TsProjWorkEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "reportid")
  private long reportId;

  @Column(name = "projid")
  private long projId;

  @Column(name = "orgid")
  private String orgId;

  @Column(name = "projectname")
  private String projectName;

  @Column(name = "projinstruction")
  private String projInstruction;

  @Column(name = "projfilename")
  private String projFileName;

  @Column(name = "uptime")
  private java.sql.Date upTime;


}

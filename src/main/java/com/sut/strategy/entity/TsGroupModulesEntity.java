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
@Table(name = "TS_GroupModules",schema = "dbo")
public class TsGroupModulesEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "uid")
  private long uid;

  @Column(name = "groupid")
  private long groupId;

  @Column(name = "moduleuid")
  private long moduleUid;

  @Column(name = "moduleid")
  private String moduleId;

  @Column(name = "state")
  private long state;

  @Column(name = "bz")
  private String bz;

  @Column(name = "timebegin")
  private java.sql.Timestamp timeBegin;

  @Column(name = "timeend")
  private java.sql.Timestamp timeEnd;


}

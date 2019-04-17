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
@Table(name = "TS_MODULE",schema = "dbo")
public class TsModuleEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "uid")
  private long uid;

  @Column(name = "id")
  private String id;

  @Column(name = "parentid")
  private String parentid;

  @Column(name = "name")
  private String name;

  @Column(name = "url")
  private String url;

  @Column(name = "type")
  private String type;

  @Column(name = "iconurl")
  private String iconurl;


}

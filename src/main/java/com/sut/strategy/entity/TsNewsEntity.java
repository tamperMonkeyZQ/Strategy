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
@Table(name = "TS_NEWS",schema = "dbo")
public class TsNewsEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "newid")
  private long newId;

  @Column(name = "subject")
  private String subject;

  @Column(name = "time")
  private java.sql.Date time;

  @Column(name = "authorid")
  private String authorId;

  @Column(name = "context")
  private String context;

  @Column(name = "columnid")
  private String columnId;

  @Column(name = "isnew")
  private String isNew;

  @Column(name = "pageurl")
  private String pageUrl;

  @Column(name = "attechtitle")
  private String attechTitle;

  @Column(name = "attechurl")
  private String attechUrl;


}

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
@Table(name = "TS_GG",schema = "dbo")
public class TsGgEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "ggtitle")
  private String gGtitle;

  @Column(name = "ggcontent")
  private String gGcontent;

  @Column(name = "ggurl")
  private String ggUrl;

  @Column(name = "aid")
  private long aid;

  @Column(name = "gdate")
  private java.sql.Timestamp gdate;


}

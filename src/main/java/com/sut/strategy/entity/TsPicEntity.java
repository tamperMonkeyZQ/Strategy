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
@Table(name = "TS_PIC",schema = "dbo")
public class TsPicEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;

  @Column(name = "picurl")
  private String picUrl;

  @Column(name = "picsm")
  private String picSm;

  @Column(name = "aid")
  private long aid;

  @Column(name = "date")
  private java.sql.Timestamp date;


}

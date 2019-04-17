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
@Table(name = "D_Location",schema = "dbo")
public class DLocationEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "code")
  private String code;

  @Column(name = "area")
  private String area;


}

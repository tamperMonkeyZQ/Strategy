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
@Table(name = "D_Organization",schema = "dbo")
public class DOrganizationEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "orgid")
  private String orgId;

  @Column(name = "orgname")
  private String orgName;

  @Column(name = "bz")
  private String bz;


}

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
@Table(name = "D_DomainIndustry",schema = "dbo")
public class DDomainIndustryEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "domainid")
  private String domainId;

  @Column(name = "domainname")
  private String domainName;

  @Column(name = "industryid")
  private String industryId;

  @Column(name = "industryname")
  private String industryName;


}

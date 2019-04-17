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
@Table(name = "TS_User",schema = "dbo")
public class TsUserEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "userid")
  private long userId;

  @Column(name = "username")
  private String userName;

  @Column(name = "password")
  private String password;

  @Column(name = "orgid")
  private String orgId;

  @Column(name = "organization")
  private String organization;

  @Column(name = "locationid")
  private String locationId;

  @Column(name = "locationname")
  private String locationName;

  @Column(name = "groupid")
  private String groupId;

  @Column(name = "realname")
  private String realName;

  @Column(name = "position")
  private String position;

  @Column(name = "phone")
  private String phone;

  @Column(name = "mobile")
  private String mobile;

  @Column(name = "email")
  private String email;

  @Column(name = "fax")
  private String fax;

  @Column(name = "resourcekey")
  private String resourceKey;


}

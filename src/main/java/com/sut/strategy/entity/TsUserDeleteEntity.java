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
@Table(name = "TS_USER_delete",schema = "dbo")
public class TsUserDeleteEntity implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "username")
  private String userName;

  @Column(name = "realname")
  private String realName;

  @Column(name = "password")
  private String password;

  @Column(name = "type")
  private long type;

  @Column(name = "resourcekey")
  private String resourceKey;

  @Column(name = "groupid")
  private long groupId;

  @Column(name = "phone")
  private String phone;

  @Column(name = "email")
  private String email;

  @Column(name = "department")
  private String department;


}

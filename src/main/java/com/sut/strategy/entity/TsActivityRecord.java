package com.sut.strategy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TS_ActivityRecord",schema = "dbo")
public class TsActivityRecord {
    @Id
    @Column(name ="id")
    int id;

    @Column(name ="projId")
    int projId;
    @Column(name = "recordContent")
    String recordContent;

    @Column(name = "publishTime")
    Date publishTime;

    @Column(name = "title")
    String title;
}

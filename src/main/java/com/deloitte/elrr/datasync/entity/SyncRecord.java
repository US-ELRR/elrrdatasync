package com.deloitte.elrr.datasync.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SYNCRECORD")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SyncRecord extends Auditable<String> {
  /**
   *
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "SYNCRECORDID")
  private long syncRecordId;
  /**
   *
   */
  @Column(name = "IMPORTDETAILID")
  private long importdetailId;
  /**
   *
   */
  @Column(name = "SYNCKEY")
  private String syncKey;
  /**
   *
   */
  @Column(name = "RECORDSTATUS")
  private String recordStatus;
}

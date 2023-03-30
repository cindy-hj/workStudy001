package com.example.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_reply")
public class Reply {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int rno;
	
	// 외래키 bno
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bno")
	@JsonBackReference
	private Board bno;
	
	@Column(length = 1000)
	private String replytext;
	
	@Column(length = 50)
	private String replyer;
	
	private LocalDateTime regdate = LocalDateTime.now();
	
	private LocalDateTime updatedate;
}

package com.example.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_attach")
public class Attach {
	@Id
	@Column(length = 150)
	private String fullname;
	
	// 외래키 bno
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bno")
	@JsonBackReference
	private Board bno;
	
	private LocalDateTime regdate = LocalDateTime.now();
}

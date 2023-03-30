package com.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_board")
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 11)
	private int bno;
	
	@Column(length = 200)
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String content;
	
	@Column(length = 50)
	private String writer;
	
	private LocalDateTime regdate = LocalDateTime.now();
	
	@Column(length = 11)
	private int viewcnt;
	
	@Column(length = 11)
	private int replycnt;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "bno", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Attach> attachItem = new ArrayList<>();
	
	@JsonManagedReference
	@OneToMany(mappedBy = "bno", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Reply> replyItem = new ArrayList<>();

	public void update(String title, String content) {
		this.title = title;
		this.content = content;
		
	}
	


}

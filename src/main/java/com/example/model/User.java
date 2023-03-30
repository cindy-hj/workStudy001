package com.example.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_user")
public class User {
	@Id
	@Column(length = 50)
	private String uid;
	
	@Column(length = 50)
	private String upw;
	
	@Column(length = 100)
	private String uname;
	
	@Column(length = 11)
	private int upoint;
	
	@Column(length = 50)
	private String sessionkey;
	
	private LocalDateTime sessionlimit;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "uid", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Message> messageItem = new ArrayList<>();
}

package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Attach;
import com.example.service.AttachService;


@RestController
public class AttachController {
	@Autowired
	private AttachService attachService;
	
	// create
	@PostMapping("/api/attach")
	public ResponseEntity createAttach(@RequestBody Attach attach) {
		Attach createAttach = attachService.save(attach);
		return new ResponseEntity<>(createAttach, HttpStatus.CREATED);
	}
	
	
	// read
	
	
	
	// update
	
	
	
	//delete
	

}

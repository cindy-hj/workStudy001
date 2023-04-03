package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Reply;
import com.example.service.ReplyService;

@RestController
public class ReplyController {
	@Autowired
	private ReplyService replyService;
	
	@PostMapping("/api/reply")
	public ResponseEntity createReply(@RequestBody Reply reply) {
		Reply createReply = replyService.save(reply);
		return new ResponseEntity<>(createReply, HttpStatus.CREATED);
	}

}

package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Message;
import com.example.service.MessageService;

@RestController
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@PostMapping("/api/message")
	private ResponseEntity addMessage(@RequestBody Message message) {
		Message addMessage = messageService.save(message);
		return new ResponseEntity<>(addMessage, HttpStatus.CREATED);
	}
	
}

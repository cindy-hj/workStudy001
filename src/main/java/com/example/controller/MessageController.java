package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MessageService;

@RestController
public class MessageController {
	@Autowired
	private MessageService messageService;
}

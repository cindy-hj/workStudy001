package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ReplyService;

@RestController
public class ReplyController {
	@Autowired
	private ReplyService replyService;
}

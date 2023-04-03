package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Attach;
import com.example.repository.AttachRepository;

@Service
public class AttachService {
	@Autowired
	private AttachRepository attachRepository;
	
	// create
	public Attach save(Attach attach) {
		return attachRepository.save(attach);
	}

}

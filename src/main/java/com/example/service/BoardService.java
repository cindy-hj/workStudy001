package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Board;

import com.example.repository.BoardRepository;

import jakarta.transaction.Transactional;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	//create
	@Transactional
	public Board createBoard (Board board) {
		return boardRepository.save(board);
	}
	
	//read
	public List<Board> getBoard() {
		return boardRepository.findAll();
	}
	
	//update
	@Transactional
	public Board updateBoard(int bno, Board board) {
		Board updated = boardRepository.findById(bno).get();
		updated.update(board.getTitle(), board.getContent());
		
		return updated;
	}

	// 조회수 증가
	@Transactional
	public Board updateViewcnt(int bno) {
		Board board = boardRepository.findById(bno).get();
		board.update(board.getViewcnt());
		
		return board;
	}
	
	//delete
	@Transactional
	public Board delete(int bno) {
		Board deleteBoard = boardRepository.findById(bno).get();
		boardRepository.deleteById(bno);
		return deleteBoard;
	}

	
}

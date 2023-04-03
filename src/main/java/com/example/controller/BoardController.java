package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Board;
import com.example.service.BoardService;


@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;

	// create
	@PostMapping("/api/boards")
	public ResponseEntity<Board> createBoard(@RequestBody Board board) {
		Board postBoard = boardService.createBoard(board);
		return new ResponseEntity<>(postBoard, HttpStatus.CREATED);
	}
	
	// read
	@GetMapping("/api/boards")
	public ResponseEntity<List<Board>> getBoard() {
		List<Board> boards = boardService.getBoard();
		return new ResponseEntity<List<Board>>(boards, HttpStatus.OK);
	}
	
	// update
	@PutMapping("/api/boards/{bno}")
	public ResponseEntity<Board> updateBoard(@PathVariable int bno, @RequestBody Board board) {
		Board updateBoard = boardService.updateBoard(bno, board);
		return new ResponseEntity<>(updateBoard, HttpStatus.ACCEPTED);
	}
	
	// delete
	@DeleteMapping("/api/boards/{bno}")
	public ResponseEntity<Board> deleteBoard(@PathVariable int bno) {
		Board deleteBoard = boardService.delete(bno);
		return new ResponseEntity<>(deleteBoard, HttpStatus.OK);
	}
	
}

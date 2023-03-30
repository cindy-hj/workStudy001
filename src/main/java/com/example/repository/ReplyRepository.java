package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {

}

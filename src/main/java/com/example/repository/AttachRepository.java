package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Attach;

public interface AttachRepository extends JpaRepository<Attach, String> {

}

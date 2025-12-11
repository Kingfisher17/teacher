package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.IdNotFound;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ IdNotFound.class })
	public ResponseEntity<?> idNotFoundHandler(IdNotFound e) {
		return ResponseEntity.status(639).body(e.getMessage());
	}

}

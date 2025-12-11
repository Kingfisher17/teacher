package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService ts;

	@PostMapping("add")
	public void add(@RequestBody Teacher teacher) {
		ts.add(teacher);
	}

	@GetMapping("display")
	public List<Teacher> display() {
		return ts.display();
	}
	
	@PostMapping("search = {id}")
	public ResponseEntity<?> search(@PathVariable Integer id){
		Teacher result = ts.search(id);
		return new ResponseEntity<Teacher>(result, HttpStatus.OK);
	}
	

//	@GetMapping("subject")
//	public ResponseEntity<?> error() {
//		throw new NullPointerException("INVALID SUBJECT");
//	}

}

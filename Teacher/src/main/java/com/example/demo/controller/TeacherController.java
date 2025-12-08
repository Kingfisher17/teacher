package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class TeacherController {

	@Autowired
	private TeacherService ts;
	
	
	@PostMapping("add")
	public void add(@RequestBody Teacher teacher) {
		ts.add(teacher);
	}
	
	
	@GetMapping("/")
	public List<Teacher> display() {
		return ts.display();
	}
	
}

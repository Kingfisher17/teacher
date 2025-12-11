package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.IdNotFound;
import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository tr;

	@Override
	public void add(Teacher t) {
		// TODO Auto-generated method stub
		tr.save(t);
	}

	@Override
	public List<Teacher> display() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		tr.deleteById(id);
	}

	@Override
	public void update(Integer id, Teacher t) {
		// TODO Auto-generated method stub
		t.setId(id);
		tr.save(t);
	}

	@Override
	public Teacher search(Integer id) {

		if (!tr.existsById(id))
			throw new IdNotFound("ID NOT Found !!");
		return tr.findById(id).get();
	}

}

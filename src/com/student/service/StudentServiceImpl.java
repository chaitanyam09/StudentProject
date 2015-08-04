package com.student.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.dto.StudentDetails;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@org.springframework.transaction.annotation.Transactional
	public void add(StudentDetails details) {
		
		studentDao.add(details);
	}

	@org.springframework.transaction.annotation.Transactional
	public void edit(StudentDetails details) {
		studentDao.edit(details);
		
	}

	@org.springframework.transaction.annotation.Transactional
	public void delete(int studentId) {
		studentDao.delete(studentId);
		
	}

	@org.springframework.transaction.annotation.Transactional
	public StudentDetails getStudent(int stdId) {
		
		return studentDao.getStudent(stdId);
	}

	@org.springframework.transaction.annotation.Transactional
	public List getAllStudent() {
		return studentDao.getAllStudent();
	}

}

package com.student.dao;

import java.util.List;

import com.student.dto.StudentDetails;

public interface StudentDao {
	
	public void add(StudentDetails details);
	public void edit(StudentDetails details);
	public void delete(int studentId);
	public StudentDetails getStudent(int stdId); 
	public List getAllStudent();
}

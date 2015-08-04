package com.student.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.dto.StudentDetails;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory session;

	@Override
	public void add(StudentDetails details) {
			session.getCurrentSession().save(details);
		
	}

	@Override
	public void edit(StudentDetails details) {
			session.getCurrentSession().update(details);
		
	}

	@Override
	public void delete(int stdId) {
		session.getCurrentSession().delete(getStudent(stdId));
		
	}

	@Override
	public StudentDetails getStudent(int stdId) {
		// TODO Auto-generated method stub
		return (StudentDetails) session.getCurrentSession().get(StudentDetails.class, stdId);
	}

	@Override
	public List getAllStudent() {
		return session.getCurrentSession().createQuery("from StudentDetails").list();
	
	}


}

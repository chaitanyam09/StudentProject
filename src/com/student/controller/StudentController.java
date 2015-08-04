package com.student.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.dto.StudentDetails;
import com.student.service.StudentService;

	@Controller
	public class StudentController {
		@Autowired
		private StudentService studentService;
		
		@RequestMapping("/index")
		public String setupForm(Map<String, Object> map){
			StudentDetails student = new StudentDetails();
			map.put("student", student);
			map.put("studentList", studentService.getAllStudent());
			return "student";
		}
		@RequestMapping(value="/student.do", method=RequestMethod.POST)
		public String doActions(@ModelAttribute StudentDetails student, BindingResult result, @RequestParam String action, Map<String, Object> map){
			StudentDetails studentResult = new StudentDetails();
			switch(action.toLowerCase()){	//only in Java7 you can put String in switch
			case "add":
				studentService.add(student);
				studentResult = student;
				break;
			case "edit":
				studentService.edit(student);
				studentResult = student;
				break;
			case "delete":
				studentService.delete(student.getStdId());
				studentResult = new StudentDetails();
				break;
			case "search":
				StudentDetails searchedStudent = studentService.getStudent(student.getStdId());
				studentResult = searchedStudent!=null ? searchedStudent : new StudentDetails();
				break;
			}
			map.put("student", studentResult);
			map.put("studentList", studentService.getAllStudent());
			return "student";
		}
	}



package com.SBUsingIDE.Autowiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.SBUsingIDE.Autowiring.Dao.studentDao;
import com.SBUsingIDE.Autowiring.model.Student;
import com.SBUsingIDE.Autowiring.service.studentService;

@Controller
public class studentController {

// Field Injection
//	@Autowired
//	private studentService studentService;
	
	
//	Setter Injection
//	private studentService studentService;
//	@Autowired
//	public void setStudentService(studentService studentService) {
//		this.studentService = studentService;
//		System.out.println("Setter Called Controller");
//	}

	
	//Constructor Injection
	private studentService studentService;
	@Autowired
	public studentController(com.SBUsingIDE.Autowiring.service.studentService studentService) {
	super();
	this.studentService = studentService;
	System.out.println("Student Controller Constructor");
	System.out.println("This is another student controller constructor");
}


	public Student savestudentController(Student stu)
	{
		
		Student stu1 = studentService.savestudentService(stu);
		return stu1;
		
	}
	
}

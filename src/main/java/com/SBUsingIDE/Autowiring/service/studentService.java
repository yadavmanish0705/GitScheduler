package com.SBUsingIDE.Autowiring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SBUsingIDE.Autowiring.Dao.studentDao;
import com.SBUsingIDE.Autowiring.model.Student;

@Service
public class studentService {
	

//	Field Injection
//	@Autowired
//	private studentDao studentdao;
	
//	Setter Injection
//	private studentDao studentdao;
//	@Autowired
//	public void setStudentdao(studentDao studentdao) {
//		this.studentdao = studentdao;
//		System.out.println("Setter Called Service");
//	}
	
	
	//Constructor Injection
	private studentDao studentdao;
	@Autowired
	public studentService(studentDao studentdao) {
	super();
	this.studentdao = studentdao;
	System.out.println("Student Service Constructor");
	System.out.println("This is another student service constructor");
}


	public Student savestudentService(Student stu)
	{
		
		Student stu1 = studentdao.savestudentDao(stu);
		
		return stu1;
		
	}
	

	//This is QA Code
	public void QAcode()
	{
		System.out.println("This is the code of QA Team");

	
	public void DeveloperCode()
	{
		System.out.println("This is the developer code");

	}
}

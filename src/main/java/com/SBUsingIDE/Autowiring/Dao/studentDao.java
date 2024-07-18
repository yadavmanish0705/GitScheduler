package com.SBUsingIDE.Autowiring.Dao;

import org.springframework.stereotype.Repository;

import com.SBUsingIDE.Autowiring.model.Student;

@Repository
public class studentDao {

	public Student savestudentDao(Student stu)
	{
		System.out.println(stu);
		
		return stu;
		
	}
}

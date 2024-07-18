package com.SBUsingIDE.Autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SBUsingIDE.Autowiring.controller.studentController;
import com.SBUsingIDE.Autowiring.model.Student;

@SpringBootApplication
public class AutowiringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AutowiringApplication.class, args);
		
		
		
		
	}

	
	
	
	//Second Task
	public String After()
	{
		return "Evening";
	}
}

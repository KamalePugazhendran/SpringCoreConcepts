package com.tnsif.springcore3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	  //leads the config file
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    //getbean
    College college = context.getBean("college", College.class);
    
    college.showCollegeDetails();
    
  }
}

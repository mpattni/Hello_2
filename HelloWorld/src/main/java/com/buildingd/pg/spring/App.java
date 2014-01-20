package com.buildingd.pg.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/buildingd/pg/spring/config/beans.xml");
		
		Person person = (Person)context.getBean("person");
		System.out.println(person);

		((ClassPathXmlApplicationContext) context).close();
	}

}

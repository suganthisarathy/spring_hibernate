package com.pack;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld h=(HelloWorld)context.getBean("id");
		System.out.println(h.getMessage());
		context.registerShutdownHook();

	}

}

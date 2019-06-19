package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
		FristBean s=(FristBean)fact.getBean("bean1");
		s.check();

	}

}

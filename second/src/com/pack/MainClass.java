package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
 public static void main(String args[])
 {
	// Resource res= new FileSystemResource("beans.xml");
	// BeanFactory fact=new XmlBeanFactory(res);
	 ApplicationContext fact=new ClassPathXmlApplicationContext("beans.xml");
	 HelloWorld h=(HelloWorld)fact.getBean("helloWorld");
	 System.out.println(h.getMessage());
 }
}

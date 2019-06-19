package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
	
private SecondBean secondBean;
private String name;




@Autowired
public FirstBean(SecondBean secondBean, String name) {
	super();
	this.secondBean = secondBean;
	this.name = name;
}





public void check()
{
	secondBean.check1();
}
}

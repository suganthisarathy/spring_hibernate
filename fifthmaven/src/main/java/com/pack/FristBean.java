package com.pack;

public class FristBean {
private SecondBean secondBean;

public SecondBean getSecondBean() {
	return secondBean;
}

public void setSecondBean(SecondBean secondBean) {
	this.secondBean = secondBean;
}
public void check()
{
	secondBean.check1();
}
}

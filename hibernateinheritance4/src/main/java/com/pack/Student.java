package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp700")
public class Student {
	@Id
	@Column(name="sid")
private int studentid;
	@Column(name="sname",length=20)
	
private String studentname;
	@Column(name="grp",length=10)
private String studentgroup;
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentgroup() {
	return studentgroup;
}
public void setStudentgroup(String studentgroup) {
	this.studentgroup = studentgroup;
}

}

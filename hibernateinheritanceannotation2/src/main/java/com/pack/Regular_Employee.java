package com.pack;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="emp601")
@AttributeOverrides({
	@AttributeOverride  (name="id",column=@Column(name="id")),
	@AttributeOverride (name="name",column=@Column(name="name"))
					
})

public class Regular_Employee  extends Employee{
private float salary;
private int bonus;
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
}

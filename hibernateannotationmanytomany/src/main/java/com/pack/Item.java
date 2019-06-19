package com.pack;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {
	@Id
private int itemId;
	private String itemName;
	@ManyToMany(targetEntity=Categories.class,mappedBy="item")
	private Set categories;
public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Set getCategories() {
		return categories;
	}
	public void setCategories(Set categories) {
		this.categories = categories;
	}

public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	

}

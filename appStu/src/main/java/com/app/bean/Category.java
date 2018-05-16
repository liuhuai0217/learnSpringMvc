package com.app.bean;

import java.io.Serializable;
public class Category  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1515764354614954327L;

	private int id;
	
	private String name;
	
	public Category(){}
	
	public Category(int id,String name){
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

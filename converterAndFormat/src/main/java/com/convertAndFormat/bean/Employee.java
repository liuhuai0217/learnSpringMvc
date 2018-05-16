package com.convertAndFormat.bean;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4007075960117461277L;
	
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private Date brithDate;
	
	private int salaryLevel;
}

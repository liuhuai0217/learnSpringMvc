package com.validator.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2399483499867824902L;
	
	private String name;
	
	private String description;
	
	private Float price;
	
	private Date productionDate;

}

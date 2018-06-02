package com.fileUpload.bean;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;


@Data
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 483538928985914614L;
	
	private String name;

	private String description;
	
	private Float price;
					
	private List<MultipartFile> images;
}

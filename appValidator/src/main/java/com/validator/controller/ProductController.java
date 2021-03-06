package com.validator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.validator.bean.Product;
import com.validator.validator.ProductValidator;

@Controller
public class ProductController {

	@RequestMapping("product_input")
	public String productInput(Model model){
		model.addAttribute("product", new Product());
		return "ProductForm";
	}
	@RequestMapping("product_save")
	public String saveProduct(@ModelAttribute Product product,BindingResult bindingResult,Model model){
		ProductValidator productValidator = new ProductValidator();
		productValidator.validate(product, bindingResult);
		if(bindingResult.hasErrors()){
			FieldError  error = bindingResult.getFieldError();
			System.out.println("=======================");
			System.out.println("getCode："+error.getCode()+"    f：" +error.getField()+"   m："+error.getDefaultMessage()+"  o："+error.getObjectName()+"   a："+error.getArguments()+"   r："+
			error.getRejectedValue()+"  【】 "+error.getCodes());
			return "ProductForm";
		}
		model.addAttribute("product",product);
		return  "ProductDetail";
	}
	
}

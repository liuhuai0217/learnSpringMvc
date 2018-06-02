package com.language.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.language.bean.Product;

@Controller
public class ProductController {

	@RequestMapping("product_input")
	public String productInput(Model model){
		model.addAttribute("product", new Product());
		System.out.println("hahhahahah");
		return "ProductForm";
	}
}

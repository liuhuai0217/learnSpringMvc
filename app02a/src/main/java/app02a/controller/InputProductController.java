package app02a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import app02a.form.ProductForm;


@Controller
public class InputProductController{

	@RequestMapping("/product_input.action")
	public String productform(){
		// TODO Auto-generated method stub
		return "ProductForm";
	}
	
	@RequestMapping("/product_save.action")
	public String saveProdct(ProductForm product,Model model){
		model.addAttribute("product",product);
		return "ProductDetail";
		
	}

}

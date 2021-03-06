package com.fileUpload.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;			
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fileUpload.bean.Product;

@Controller
public class ProductController {

	@RequestMapping("product_input")
	public String inputProduct(Model model){
		model.addAttribute("product", new Product());
		return "ProductForm";
	}
	@RequestMapping("product_save")
	public ModelAndView saveProject(HttpServletRequest req,@ModelAttribute Product product,Model model,BindingResult resutl){
		System.out.println(product.getName()+"=========="+product.getPrice()+"=========="+product.getDescription()+"====="+product.getImages());
		List<MultipartFile> images = product.getImages();
		List<String> imagename = new ArrayList<>();
		if(null!=images&&images.size()>0){
			for(MultipartFile m:images){
				String filename = m.getOriginalFilename();
				imagename.add(filename);
				File imageFile = new File(req.getServletContext().getRealPath("/image"),filename);
				System.out.println(imageFile);
				try {
					m.transferTo(imageFile);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		return new ModelAndView("ProductDetail", "product",product);
	}
}

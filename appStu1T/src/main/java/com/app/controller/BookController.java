package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.BookService;

@Controller
public class BookController {

	@Autowired
	public BookService bookService;
	
	@RequestMapping("book_list")
	public String bookList(Model model){
		model.addAttribute("books", bookService.getAllBooks());
		return "bookList";
		
	}
}

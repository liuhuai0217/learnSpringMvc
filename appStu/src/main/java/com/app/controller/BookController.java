package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.bean.Book;
import com.app.bean.Category;
import com.app.service.BookService;




@Controller
public class BookController {

	@Autowired
	public BookService bookService;
	
	@RequestMapping(value="/book_list")
	public String bookList(Model model){
		model.addAttribute("books", bookService.getAllBooks());
		return "bookList";
		
	}
	@RequestMapping(value="/edit_book/{id}")
	public String editBook(Model model,@PathVariable long id){
		System.out.println(id);
		List<Category> categorys = bookService.getAllCategory();
		model.addAttribute("categorys", categorys);
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "editbookDetail";
	}
	@RequestMapping(value="/update_book")
	public String updateBook(@ModelAttribute Book book){
		Category c = bookService.getCategoryById(book.getCategory().getId());
		book.setCategory(c);
		bookService.updateBook(book);
		return "redirect:/book_list";
	}
	@RequestMapping("/book_input")
	public String input(Model model){
		List<Category> categorys = bookService.getAllCategory();
		model.addAttribute("book", new Book());
		model.addAttribute("categorys", categorys);
		return "addBook";
	}
	@RequestMapping("/book_save")
	public String saveBook(@ModelAttribute Book book){
		Category categorys = bookService.getCategoryById(book.getCategory().getId());
		book.setCategory(categorys);
		bookService.saveBook(book);
		return "redirect:/book_list";
	}
}

package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.bean.Book;
import com.app.bean.Category;


public interface BookService {

	public List<Book> getAllBooks();
	
	
	public List<Category> getAllCategory();
	
	
	public Category getCategoryById(Long id);
	
	
	public Book getBookById(Long id);
	
	
	public void saveBook(Book book);
	
	public Long  getNextBookId();
	
	public void  updateBook(Book book);
	
}

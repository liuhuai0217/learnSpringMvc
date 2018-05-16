package com.app.service;

import java.util.List;
import com.app.bean.Book;
import com.app.bean.Category;


public interface BookService {

	 List<Book> getAllBooks();
	
	
	 List<Category> getAllCategory();
	
	
	 Category getCategoryById(Long id);
	
	
	 Book getBookById(Long id);
	
	
	 void saveBook(Book book);
	
	 Long  getNextBookId();
	
	 Book  updateBook(Book book);
	
}

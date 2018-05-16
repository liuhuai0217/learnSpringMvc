package com.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.bean.Book;
import com.app.bean.Category;
import com.app.service.BookService;


@Service
public class BookServiceImpl implements BookService {

	
	private List<Category> categorys;
	
	private List<Book> books;
	
	public BookServiceImpl(){
		categorys  = new ArrayList<>();
		Category ca1 = new Category(1,"JAVA");
		Category ca2 = new Category(2,"PATHON");
		Category ca3 = new Category(3,"PHP");
		categorys.add(ca1);
		categorys.add(ca2);
		categorys.add(ca3);
		books = new ArrayList<>();
		Book b1  = new Book(1l, "2343453453", "java", ca1, "guess");
		Book b2  = new Book(2l, "2343453453", "pthon", ca2, "guess");
		Book b3  = new Book(3l, "2343453453", "php", ca3, "guess");
		books.add(b1);
		books.add(b2);
		books.add(b3);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categorys;
	}

	@Override
	public Category getCategoryById(Long id) {
		// TODO Auto-generated method stub
		Category ca = null;
		for(Category c :categorys){
			if(id == c.getId()){
				ca = c;
			}
		}
		return ca;
	}
	@Override
	public Book getBookById(Long id) {
		// TODO Auto-generated method stub
		for(Book b:books){
			if(id==b.getId()){
				return b;
			}
		}
		return null;
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		book.setId(getNextBookId());
		books.add(book);
	}
	@Override
	public Long getNextBookId() {
		Long id = 0L;
		for(Book  b:books){
			Long bookID=b.getId();
			if(id>bookID){
				id = bookID;
			}
		}
		return id+1;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		for(int i=0;i<books.size();i++){
			Book b = books.get(i);
			if(b.getId()==book.getId()){
				books.set(i, book);
				return book;
			}
		}
		return book;
	}
}

package com.lfsoftware.socialbooks.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lfsoftware.socialbooks.domain.Book;

@RestController
public class BooksResources {
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> list() {
		Book bookOne = new Book("GitHub Essentials");
		Book bookTwo = new Book("C");
		Book bookTree = new Book("Python");
		Book bookFor = new Book("Java Web");
		
		Book[] books = {bookOne, bookTwo, bookTree, bookFor};
		return Arrays.asList(books);
	}
}

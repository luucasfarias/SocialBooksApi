package com.lfsoftware.socialbooks.domain;

import java.util.Date;
import java.util.List;

public class Book {
	private Long id;
	private String name;
	private String publishing_company;
	private Date publication_date;
	private String resume;
	private List<Comment> comments;
	
	public Book() {}
	
	public Book(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishing_company() {
		return publishing_company;
	}
	public void setPublishing_company(String publishing_company) {
		this.publishing_company = publishing_company;
	}
	public Date getPublication_date() {
		return publication_date;
	}
	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String author;
}

package com.collection;



public class BookBean {
	
	@Override
	public String toString() {
		return "BookBean [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}
	int id;  
	String name,author,publisher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public BookBean(int id, String name, String author, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	} 
}

package com.piedaholic.bookcatalog.model;

import java.util.List;

public class Book{
    private String id;
    private String name;
    private String publisher;
    private List<String> authors;
	/**
	 * @param id
	 * @param name
	 * @param publisher
	 * @param authors
	 */
	public Book(String id, String name, String publisher, List<String> authors) {
		super();
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.authors = authors;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the authors
	 */
	public List<String> getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
    
}
package com.hk;

import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private String order_id;
	private Map<String, String> addr;
	private List<String> book;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.substring(0,3);
//		this.name = name;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public Map<String, String> getAddr() {
		return addr;
	}
	public void setAddr(Map<String, String> addr) {
		this.addr = addr;
	}
	public List<String> getBook() {
		return book;
	}
	public void setBook(List<String> book) {
		this.book = book;
	}
	
	
}

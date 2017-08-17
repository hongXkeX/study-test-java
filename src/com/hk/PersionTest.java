package com.hk;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PersionTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("123");
		person.setOrder_id("1234");
		Map<String, String> addr = new HashMap<String, String>();
		addr.put("姓名", "yanhhh");
		addr.put("电话", "123456");
		addr.put("地址", "北京");
		person.setAddr(addr);
		List<String> books =new LinkedList<String>();
		books.add("book1");
		books.add("book2");
		person.setBook(books);
		
		System.out.println(person.getName());
	}
}

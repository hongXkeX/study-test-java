package com.hk;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		System.out.println("没数据前直接打印原list结构：");
		System.out.println(list);
		
		// 增：
		for (int i = 0; i < 4; i++) {
			list.add((char)(i+97)+"");
		}
		System.out.println("直接打印原list结构：");
		System.out.println(list);
		System.out.println();
		
		// 删：
		list.remove(1);
		list.remove("a");
		System.out.println("打印删除数据后list结构：");
		System.out.println(list);
		System.out.println();

		// 查在遍历中：
		// 第一种遍历 	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		// 第二种遍历
		for(String s : list){
			System.out.println(s);
		}
		System.out.println();

		// 第三种遍历
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}

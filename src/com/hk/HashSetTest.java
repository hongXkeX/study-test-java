package com.hk;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println("没数据前直接打印原HashSet结构：");
		System.out.println(hashSet);
		System.out.println();
		
		// 增：
		for (int i = 0; i < 4; i++) {
			hashSet.add((char)(i+97)+"");
		}
		
		// 打印原set结构内容：
		System.out.println("直接打印原HashSet结构：");
		System.out.println(hashSet);
		System.out.println();
		
		// 删：
		hashSet.remove("a");
		System.out.println("直接删除数据后HashSet结构：");
		System.out.println(hashSet);
		System.out.println();
		
		// 查在遍历中：
		// 第一种遍历：
		System.out.println("测试第一种遍历：");
		for(String str : hashSet){
			System.out.println(str);
		}
		System.out.println();
		
		// 第二种遍历：
		System.out.println("测试第二种遍历：");
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}

package com.hk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HW {
	public static void main(String[] args) {
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "zhang3");
		map1.put("age", "18");
		map1.put("salary", "3000");
		list.add(map1);
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("name", "li4");
		map2.put("age", "25");
		map2.put("salary", "3500");
		list.add(map2);

		HashMap<String, String> map3 = new HashMap<String, String>();
		map3.put("name", "wang5");
		map3.put("age", "22");
		map3.put("salary", "3200");
		list.add(map3);
		
		for(int i=0; i<list.size(); i++){
			System.out.println("第"+(i+1)+"个人的信息：");
			System.out.println("name:  "+list.get(i).get("name"));
			System.out.println("age:   "+list.get(i).get("age"));
			System.out.println("salary:"+list.get(i).get("salary"));
			System.out.println();
		}
		
		// 利用迭代遍历，对List中所有的工人信息进行遍历
		Iterator<HashMap<String, String>> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println("name:  "+iterator.next().get("name"));
			System.out.println("age:   "+iterator.next().get("age"));
			System.out.println("salary:"+iterator.next().get("salary"));
			System.out.println();
		}
		
		HashSet<String> hs = new HashSet<String>();
		for(int i=0; i<list.size(); i++){
			hs.add(list.get(i).get("name"));
		}
		System.out.println("所有姓名有：");
		for(String str : hs){
			System.out.println(str);
		}
	}
}

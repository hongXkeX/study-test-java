package com.hk;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class t1 {
	public static void main(String[] args) {
		List<Map<String, String>> list = new LinkedList<Map<String,String>>();
		
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("学号", "01");
		map1.put("姓名", "张1");
		list.add(map1);
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("学号", "02");
		map2.put("姓名", "张2");
		list.add(map2);
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++){
			System.out.println("第 " + i + " 个人信息：");
			System.out.println(list.get(i).get("姓名"));
			System.out.println(list.get(i).get("学号"));
		}
	}
}

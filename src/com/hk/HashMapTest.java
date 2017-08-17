package com.hk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println("没数据前直接打印原HashMap结构：");
		System.out.println(map);
		
		// 增：
		for (int i = 0; i < 5; i++) {
			map.put(Integer.toString(i+1), (char)(i+97)+"");
		}
		
		System.out.println("直接打印原HashMap结构：");
		System.out.println(map);
		System.out.println();
		
		// 删：
		map.remove("1");
		map.remove("2", "b");
		System.out.println("打印删除数据后HashMap结构：");
		System.out.println(map);
		
		// 改（即增加同样key的数据以覆盖改变value的值）
		map.put("3", "cc");
		System.out.println("打印改3后HashMap结构：");
		System.out.println(map);

		// 查在遍历中：
		// 第一种遍历
		System.out.println("第一次遍历");
		for(String s : map.keySet()){
			System.out.println(s+" : "+map.get(s));
		}
		
		// 第二种遍历
		System.out.println("第二次遍历");
		Iterator<String> iteratorSet = map.keySet().iterator();
		while(iteratorSet.hasNext()){
			String str = iteratorSet.next();
			System.out.println(str+" : "+map.get(str));
		}
		
		// 第三种遍历
		System.out.println("第三次遍历");
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		// 第四种遍历
		System.out.println("第四次遍历");
		for(String str : map.values()){
			System.out.println(str);
		}

		// 第五种遍历
		System.out.println("第五次遍历");
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> entry = it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}

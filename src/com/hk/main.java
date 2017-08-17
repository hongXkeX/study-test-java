package com.hk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class main {
	public static void main(String[] args) {
		/*
		 * List<String> list = new LinkedList<String>(); list.add("1");
		 * list.add("2"); list.add("3"); for(int i=0; i<list.size(); i++){
		 * System.out.println(list.get(i)); }
		 * 
		 * Iterator<String> iterator = list.iterator();
		 * while(iterator.hasNext()){ System.out.println(iterator.next()); }
		 * 
		 * Map<String,String> map = new HashMap<String, String>(); map.put("1",
		 * "a"); map.put("2", "b"); map.put("3", "c");
		 * System.out.println(map.get("1"));
		 * 
		 * // set Set<String> set = new HashSet<String>(); set.add("1");
		 * set.add("1"); set.add("2"); for(String s : set){
		 * System.out.println(s); }
		 */

		/**
		 * List相当于人群，存储很多人（map） 单个map信息的key必须不同 借助List使得可以存储多个map（人）的信息
		 */
		/*
		 * List<HashMap<String, String>> list = new
		 * LinkedList<HashMap<String,String>>();
		 * 
		 *//**
			 * 每个map存一个人的信息
			 *//*
			 * HashMap<String, String> map1 = new HashMap<String, String>();
			 * map1.put("name", "王二小"); map1.put("sex", "男"); map1.put("nation",
			 * "汉"); map1.put("birth", "1990-09-12"); map1.put("addr", "北京海淀区");
			 * map1.put("cardid", "123"); list.add(map1);
			 * 
			 * HashMap<String, String> map2 = new HashMap<String, String>();
			 * map2.put("name", "王二小"); map2.put("sex", "男"); map2.put("nation",
			 * "汉"); map2.put("birth", "1990-09-12"); map2.put("addr", "北京海淀区");
			 * map2.put("cardid", "123"); list.add(map2);
			 * 
			 * for(int i=0; i<list.size(); i++){ System.out.println("第 "+i+
			 * " 个人信息："); System.out.println(list.get(i).get("name"));
			 * System.out.println(list.get(i).get("sex"));
			 * System.out.println(list.get(i).get("nation"));
			 * System.out.println(list.get(i).get("birth"));
			 * System.out.println(list.get(i).get("addr"));
			 * System.out.println(list.get(i).get("cardid")); }
			 */

		List<HashMap<String, String>> list = new LinkedList<HashMap<String, String>>();

		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("账号", "12345678");
		map1.put("昵称", "建军");
		map1.put("英文名", "zhangsan");
		map1.put("分组", "我的好友");
		map1.put("个人信息", "男 28岁 10-2 兔 天枰座 B型血");
		map1.put("故乡", "中国山东威海文登市");
		map1.put("所在地", "中国山东威海");
		map1.put("手机", "1234");
		map1.put("邮箱", "123@qq.com");
		map1.put("Q龄", "10年");
		map1.put("语言", "中文");
		map1.put("学习", "高中");
		list.add(map1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("第 " + i + " 个人信息：");
			System.out.println(list.get(i).get("账号"));
			System.out.println(list.get(i).get("昵称"));
			System.out.println(list.get(i).get("英文名"));
		}
		
		

	}
}

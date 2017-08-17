package com.hk;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class m1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "a");
		
		for (String str : map.values()) {
			System.out.println(str);
		}
	}
}

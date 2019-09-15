package com.java.practice;

import java.util.HashMap;
import java.util.Set;

public class HashMapPractice {
	
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "Anand");
		map.put("age", "34");
		map.put("qualification", "BB");
		
		System.out.println(map);
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for(String s: keys){
			System.out.println(map.get(s));
		}
	}

}

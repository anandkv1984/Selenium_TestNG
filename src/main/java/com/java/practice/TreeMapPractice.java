package com.java.practice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
	
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>();
		
		System.out.println(map.put("name", "Anand"));
		System.out.println(map.put("name", "Raju"));
		System.out.println(map.put("name", "Karan"));
		System.out.println(map.put("age", "34"));
		System.out.println(map.put("qualification", "BB"));
		
		System.out.println(map.get("name"));
		
		System.out.println(map.remove("name"));
		System.out.println(map.remove("name"));
		
		System.out.println(map.containsKey("name"));
		
		
	}

}

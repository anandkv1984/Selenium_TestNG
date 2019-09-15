package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Anand");
		list.add("Siddhi");
		list.add("Anita");
		
		System.out.println(list);
		
		list.add(1, "Raju");
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		
		System.out.println(list.indexOf("Anand"));
		System.out.println(list.indexOf("Raju"));
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}

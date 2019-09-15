package com.java.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Anand");
		linkedList.add("Sujata");
		linkedList.add("Soman");
		linkedList.add("Karan");
		linkedList.add("Zameer");
		linkedList.add("Anand");
		linkedList.add(4, "Peter");
		System.out.println(linkedList);
		linkedList.sort(null);
		System.out.println(linkedList);
		linkedList.remove(1);
		System.out.println(linkedList);
		System.out.println("size = " + linkedList.size());
		System.out.println(linkedList.lastIndexOf("Karan"));
		
		List<String> sublist = new LinkedList<String>();
		sublist = linkedList.subList(2, 5);
		
		System.out.println(sublist);
		System.out.println("size = " + sublist.size());
	}
}

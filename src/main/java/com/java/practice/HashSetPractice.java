package com.java.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {
	
	public static void main(String[] args) {
		
		Set<Integer> a = new HashSet<Integer>();
		System.out.println(a.add(21));
		System.out.println(a.add(22));
		System.out.println(a.add(23));
		System.out.println(a.add(22));
		System.out.println(a.add(0));
		System.out.println(a.add(229));
		
		System.out.println(a);
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		System.out.println(treeSet.add(21));
		System.out.println(treeSet.add(22));
		System.out.println(treeSet.add(23));
		System.out.println(treeSet.add(22));
		System.out.println(treeSet.add(0));
		System.out.println(treeSet.add(229));
		
		System.out.println(treeSet);
		
		Set<String> treeSet2 = new TreeSet<String>();
		System.out.println(treeSet2.add("AA"));
		System.out.println(treeSet2.add("b"));
		System.out.println(treeSet2.add("BB"));
		System.out.println(treeSet2);
	}

}

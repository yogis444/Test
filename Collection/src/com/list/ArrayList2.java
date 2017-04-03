package com.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	
	static ArrayList al=new ArrayList<>();
	public static void main(String[] args) {
		al.add(10);
		al.add(20);
		al.add(55);
		al.add(5);
		al.add(1);
		al.add(12);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
	
}

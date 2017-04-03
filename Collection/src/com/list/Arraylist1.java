package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Arraylist1 {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	Vector v=new Vector<>();
	System.out.println(v.capacity());
	for(int i=0;i<12;i++){
		v.add(i);
	}
	System.out.println(v.capacity());
	v.trimToSize();
	Collections.sort(al);
	System.out.println(v.capacity());
	int i=100;
	al.add(101);
	al.add(i);
	al.add("xyz");
	ArrayList al1=new ArrayList<>();
	al1.addAll(al);
	System.out.println(al1);
}
}

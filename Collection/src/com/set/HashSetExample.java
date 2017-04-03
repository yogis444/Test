package com.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student{
	private Integer rollno;
	private String name;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int hashCode(){
		return rollno;
	}
	public boolean equals(Object obj){
		if(obj instanceof Student){
			Student std=(Student)obj;
			return this.rollno.equals(std.rollno);
		}else {
			return false;
		}
	}
}
public class HashSetExample {
public static void main(String[] args) {
	Student s1=new Student(101, "xyz");
	Student s2=new Student(102, "abc");
	Student s3=new Student(103, "pqr");
	Student s4=new Student(101, "xyz");
	Student s5=new Student(102, "abc");
	Student s6=new Student(101, "xyz");
	Student s7=new Student(102, "abc");
	Set<Student> hs=new HashSet();
	HashSet<Student> hs1=new HashSet<>();
	hs.add(s1);
	hs.add(s7);
	hs.add(s6);
	hs.add(s5);
	hs.add(s4);
	hs.add(s3);
	hs.add(s2);
	System.out.println(hs);
}
}

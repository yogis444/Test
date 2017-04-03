package com.list;

import java.util.ArrayList;
import java.util.Iterator;
class Student {
	String name;
	int rollno;
	String course;
	int fee;
Student(String name,int rollno,String course,int fee){
this.name=name;
this.rollno=rollno;
this.course=course;
this.fee=fee;
	}
public boolean equals(Object obj){
return(this==obj);
}

public String toString(){
	return "\nName :"+name+
		       "\nRoll No :"+rollno+
		       "\nCourse :"+course+
		       "\nFee :"+fee;
	}
}
public class ArrayListEx1{
public static void main(String[] args){
		Student s1=new Student("sathish",123,"java",800);
		Student s4=new Student("sathish",123,"java",800);
		Integer i=10;
		Integer j=10;
		System.out.println(i.equals(j));
		//System.out.println(s1.equals(s4));//true
		System.out.println(s1==s4);//false
		Student s2=new Student("venky",124,"c,c++",1000);
		Student s3=new Student("3sha",125,"Oracle",500);
ArrayList al=new ArrayList();

		al.add(s1);
		al.add(s3);
		al.add(s2);
		//System.out.println(al);
		Iterator itr=al.iterator();
  		while(itr.hasNext()){
    		Student st=(Student)itr.next();
//System.out.println(st);
	}
}
}

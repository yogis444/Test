package com.list;

import java.util.*;
class ArrayListDemo{
 public static void main(String args[]){
   ArrayList al=new ArrayList();
   System.out.println(al.size());
   
  al.add("Ravi");
  al.add("Vijay");
  al.add("Ravi");//duplicated String object
  al.add("Ajay");
al.add(null);
System.out.println(al);
}
 }

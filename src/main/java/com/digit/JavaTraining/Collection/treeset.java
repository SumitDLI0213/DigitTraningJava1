package com.digit.JavaTraining.Collection;
import java.util.*;
public class treeset 
{
   public static void main(String[] args) 
   {
	  TreeSet ts=new TreeSet();
	  ts.add(300);
	  ts.add(400);
	  ts.add(100);
	  ts.add(10);
	  ts.add(50);
	  ts.add(80);
	  ts.add(8);
	  ts.add(70);
	  ts.add(160);
	  ts.add(75);
	  ts.add(25);
	  System.out.println(ts);
      ts.comparator();
      System.out.println(ts.ceiling(10));
	 System.out.println(ts);
}
}

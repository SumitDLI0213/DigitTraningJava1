package com.digit.JavaTraining.Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class hashset 
{
	public static void main(String[] args) 
	   {
		HashSet hs=new HashSet();
		  hs.add(300);
	      hs.add(400);
		  hs.add(100);
		  hs.add(10);
		  hs.add(50);
		  hs.add(80);
	      hs.add(100000000);
	      hs.add(70);
		  hs.add(160);
		  hs.add(75);
		  hs.add(25);
		  System.out.println(hs);
	      System.out.println(hs.contains(80));
	      System.out.println(hs.iterator());
		  System.out.println();
	}
}

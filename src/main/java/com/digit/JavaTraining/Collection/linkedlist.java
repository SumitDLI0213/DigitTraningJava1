package com.digit.JavaTraining.Collection;

import java.util.LinkedList;

public class linkedlist 
{
   public static void main(String[] args) 
   {
	  LinkedList li=new LinkedList();
	  li.add(100);
	  li.add(200);
	  li.add(300);
	  li.add("sumit");
	  System.out.println(li);
	  // to pop first element
	  li.remove(1);
	 
	  li.pop();
	  //to delete first element
	  li.poll();
	  li.peek();
	  li.removeLast();
	  System.out.println(li);
	  li.offer("sumit");
	  System.out.println(li);
}
}

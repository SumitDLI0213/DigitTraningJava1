package com.digit.JavaTraining.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class iterator 
{
   public static void main(String[] args) 
   {
	   ArrayList ar=new ArrayList();
	   ar.add(100);
	   ar.add(200);
	   ar.add(300);
	   ar.add(400);
	   ar.add(500);
	   ar.add(600);
	   System.out.println(ar);
	   System.out.println("------------");
	   Iterator itr =ar.iterator();
	   while(itr.hasNext()==true)
	   {
		   System.out.println(itr.next());
	   }
	   System.out.println("--------------------");
	   ListIterator litr =ar.listIterator(ar.size());
	   while(litr.hasPrevious()==true)
	   {
		   System.out.println(litr.previous());
	   }
     }
}

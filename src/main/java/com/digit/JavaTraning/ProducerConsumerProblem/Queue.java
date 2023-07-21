package com.digit.JavaTraning.ProducerConsumerProblem;

public class Queue 
{
   int x=0;
   boolean vla_x=false;
   synchronized void put(int i)
   {
	   try
	   {
		   x=i;
		 if(vla_x!=true) 
		 { 
			 
			   System.out.println("Producer has Produce the value"+x);
			 vla_x=true;
			   notify();
	   }
		 else
		 {
			 wait();
		 }
	   }
	   catch(Exception e)
	   {
		  e.printStackTrace(); 
	   }
	   
   }
   synchronized void get() 
   {
	   try
	   {
		 if(vla_x!=false) 
		 { 
	   System.out.println("Consumer Consumed the value"+x);  
	   vla_x=false;
	   notify();
	   }
		 else
		 {
			 wait();
		 }
	   }
	   catch(Exception e)
	   {
		  e.printStackTrace(); 
	   }
   }
   
}

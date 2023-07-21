package com.digit.JavaTraning.ProducerConsumerProblem;

public class consumer extends Thread
{
	Queue b;
	  public consumer(Queue q)
	  {
		  b=q;
	  }
	  public void run()
	  {
		  int i=0;
		  while(true)
		  {
			  b.get();
		  }
	  }
}

package com.digit.JavaTraning.ProducerConsumerProblem;

public class producer  extends Thread
{
  Queue a;
  public producer(Queue q)
  {
	  a=q;
  }
  public void run()
  {
	  int i=0;
	  while(true)
	  {
		  a.put(i++);
	  }
  }
}

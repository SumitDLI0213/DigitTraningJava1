package com.digit.JavaTraning.ProducerConsumerProblem;

public class producerconsumerproblem 
{
    public static void main(String[] args) 
    {
	    Queue q=new Queue();
	    producer p=new producer(q);
	    consumer c=new consumer(q);
	    p.start();
	    c.start(); 
	}
}

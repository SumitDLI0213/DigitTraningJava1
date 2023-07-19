package ExceptionHandling.java;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

class Operations
{
	void function1()throws Exception
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("inside function 1");
		System.out.println("enter num");
		int num=sc.nextInt();
		System.out.println("enter dem");
		int dem=sc.nextInt();
		int res=num/dem;
		System.out.println("reslut is "+res);
		System.out.println("left fun 1");
	}
	void func2()throws Exception
	{
		System.out.println("enter fun 2");
		function1();
		System.out.println("left fun 2");
	}
	void func3()
	{    try {
		System.out.println("enter fun 3");
		function1();
	}
	catch (Exception e) {
		System.out.println("left fun 3");
	}
	}
}
public class Throwsimplementations 
{
   public static void main(String[] args) 
   {
	   System.out.println("inside main");
	   Operations op=new Operations();
	   op.func3();
	   System.out.println("left main");
}
}

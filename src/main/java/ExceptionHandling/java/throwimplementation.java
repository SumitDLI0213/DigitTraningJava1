package ExceptionHandling.java;

import java.util.Scanner;

class Operations
{
	void function1()throws ArithmeticException
	{
		try {
		Scanner sc=new Scanner (System.in);
		System.out.println("inside function 1");
		System.out.println("enter num");
		int num=sc.nextInt();
		System.out.println("enter dem");
		int dem=sc.nextInt();
		int res=num/dem;
		System.out.println("reslut is "+res);
		}
		catch( Exception e)
		{
			System.out.println("Execption handeled in func 1");
			throw e;
		}
		finally
		{
			
		
		System.out.println("left fun 1");
		}
	}
	
}
public class throwimplementation 
{
	public static void main (String[] args) 
	   {
		try 
		{
		   System.out.println("inside main");
		   Operations op=new Operations();
		   op.function1();
	   }
	   catch(Exception e)
	   {
		   System.out.println("");
	   }
	   finally {
		   
	   
		   System.out.println("left main");
	   }
	}
}

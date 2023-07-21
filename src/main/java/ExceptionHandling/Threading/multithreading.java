package ExceptionHandling.Threading;

import java.util.Scanner;

class banking implements Runnable
{
	public void run()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Banking Started");
		System.out.println("enter acc");
		int acc =sc.nextInt();
		System.out.println("enter pin");
        int pin=sc.nextInt();
        System.out.println("banking completed");
	}
}
class add implements Runnable
{
	public void run()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Addition Started");
		System.out.println("enter num1");
		int num1 =sc.nextInt();
		System.out.println("enter num2");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println("reslut ="+res);
        System.out.println("Addition completed");
	}
}
class printing implements Runnable
{
	public void run()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Printing started Started");
		try 
		{
		for (int i=0;i<5;i++)
		{
			System.out.println("Welcome");
			Thread.sleep(3000);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("printing complete");
	}
}
public class multithreading 
{
    public static void main(String[] args) 
    {
		banking b=new banking();
		add a=new add();
		printing p=new printing();
		Thread t1=new Thread(b);
		Thread t2=new Thread(a);
		Thread t3=new Thread(p);
		t1.start();
		t2.start();
		t3.start();
	}
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling 
{
     public static void main(String[] args) 
     {
		 try {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter num");
			 int num=sc.nextInt();
			 System.out.println("enter dum");
			 int dem=sc.nextInt();
			 int res=num/dem;
			 System.out.println("reslut = "+res);
			 System.out.println("arrray operations");
			 System.out.println("enter size of an array ");
			 int n= sc.nextInt();
			 int arr[]=new int [n];
			 int arr1[]= null;
			 System.out.println("enter positon  ");
             int pos= sc.nextInt();
             System.out.println("enter value");
			 int val=sc.nextInt();
			 arr[pos]=val;
			 System.out.println("data loaded");
		 }
		 catch(ArithmeticException e1)
		 {
			 System.out.println("arthmic exception");
		 }
		 catch(NegativeArraySizeException e2)
		 {
			 System.out.println("Negative array execpton");
		 }
		 catch(ArrayIndexOutOfBoundsException e3)
		 {
			 System.out.println("array index out of bound exception");
		 }
		 catch(InputMismatchException e4)
		 {
			 System.out.println("input missmatch exception");
		 }
		 catch(NullPointerException e5)
		 {
			 System.out.println("Null pointer  exception");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Execption exception");
		 }
	}
}

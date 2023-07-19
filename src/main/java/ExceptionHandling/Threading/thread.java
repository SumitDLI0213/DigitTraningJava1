package ExceptionHandling.Threading;
import java.util.Scanner;
public class thread 
{
 public static void main(String[] args) throws Exception
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Banking system");
     System.out.println("enter account no");
     int acc=sc.nextInt();
     System.out.println("enter pin");
     int pin=sc.nextInt();
     System.out.println("banking complete");
     
     System.out.println("Now Printing ....");
     for(int i=0;i<5;i++)
     {
    	 System.out.println("Welcome");
    	 Thread.sleep(3000);
     }
     System.out.println("printing complete");
     
}
}

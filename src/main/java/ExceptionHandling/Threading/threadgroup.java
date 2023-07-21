package ExceptionHandling.Threading;

public class threadgroup implements Runnable
{
   public static void main(String[] args) 
   {
	  threadgroup tg=new threadgroup();
	  ThreadGroup tg1=new ThreadGroup("Group 1");
	  Thread t1=new Thread(tg1,tg,"first thread");
	  t1.start();
}
   public void run()
   {
	   System.out.println(Thread.currentThread().getName()+"----"+Thread.currentThread().getThreadGroup());
   }
}

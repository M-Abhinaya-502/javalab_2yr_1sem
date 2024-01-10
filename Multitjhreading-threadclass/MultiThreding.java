package javaproject;
class ThreadA extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("from ThreadA with i:"+(-1*i));
			
		}
		System.out.println("Exiting from ThreadA");
	}
}
class ThreadB extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from ThreadA with j:"+(2*j));
			
		}
		System.out.println("Exiting from ThreadB");
	}
}
class ThreadC extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("from ThreadA with k:"+((2*k)-1));
			
		}
		System.out.println("Exiting from ThreadC");
   }
	
}
public class MultiThreding
{
public static void main (String args[])
{
	ThreadA a= new ThreadA();
	Thread b= new ThreadB();
	ThreadC c= new ThreadC();
	a.start();
	b.start();
	c.start();

	
	
	
}
}

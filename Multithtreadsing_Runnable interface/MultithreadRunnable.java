package javaproject;
class ThreadX implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("from ThreadX with i:"+(-1*i));
			
		}
		System.out.println("Exiting from ThreadX");
	}
}
class ThreadY  implements Runnable
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("from ThreadY with j:"+(2*j));
			
		}
		System.out.println("Exiting from ThreadY");
	}
}
class ThreadZ  implements Runnable
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("from ThreadZ with k:"+((2*k)-1));
			
		}
		System.out.println("Exiting from ThreadZ");
   }
	
}



public class MultithreadRunnable {
	public static void main (String args[])
	{
		ThreadX a =new ThreadX();
		Thread t1=new Thread(a);
		ThreadY b =new ThreadY();
		Thread t2=new Thread(b);
		ThreadZ c=new ThreadZ();
		Thread t3=new Thread(c);
		t1.start();
		t2.start();
		
		t3.start();
		
		
		
		
	}
	}




package javaproject;

public class ThreadStates  extends Thread
{
public void run()
{
	for(int i=0;i<3;i++);
	{
		try
		{
			sleep((int)(Math.random()*100000));
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public static void main(String args[]) 
{
	new ThreadStates().start();
	new ThreadStates().start();
	System.out.println("Done");
	
}
}

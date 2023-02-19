class Printedtobe
{
	synchronized void toBePrintedThroughRun()
	{
		Thread dt=Thread.currentThread();
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e) {}
			System.out.println("Name:"+dt.getName()+" "+i);
		}
	}
}

class ThreadChild extends Thread
{
	Printedtobe tp=new Printedtobe();
	public void run()
	{
		tp.toBePrintedThroughRun();
	}
}
public class Multithread_SynchronizedMeth 
{

	public static void main(String[] args) 
	{
		ThreadChild ct1=new ThreadChild();
		ThreadChild ct2=new ThreadChild();
		ThreadChild ct3=new ThreadChild();
		ThreadChild ct4=new ThreadChild();
		ct1.start();
		ct2.start();
		ct3.start();
		ct4.start();

	}

}

/*
 Without Synchronization
Name:Thread-1 1 Name:Thread-0 1 Name:Thread-2 1 Name:Thread-3 1

Name:Thread-1 2 Name:Thread-0 2 Name:Thread-2 2 Name:Thread-3 2

Name:Thread-1 3 Name:Thread-0 3 Name:Thread-2 3 Name:Thread-3 3

Name:Thread-0 4 Name:Thread-1 4 Name:Thread-2 4 Name:Thread-3 4

Name:Thread-0 5 Name:Thread-1 5 Name:Thread-2 5 Name:Thread-3 5 
 */




class Printedto
{
	//synchronized method
//	synchronized void toBePrintedThroughRun()
//	{
//		Thread dt=Thread.currentThread(); //current thread assigned is assigned to dt
//		for(int i=1;i<=5;i++)
//		{
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch (Exception e) {}
//			System.out.println("Name:"+dt.getName()+" "+i);
//		}
	
	
	
	//Synchronized block
	void toBePrintedThroughRun()
	{
		Thread dt=Thread.currentThread();
		synchronized(this)
		{
			for(int i=5;i>=0;i--)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e) {}
				System.out.println("From Synch block Name:"+dt.getName()+" "+i+"\n");
			}
		}	
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e) {}
			System.out.println("From Non-synch blockName:"+dt.getName()+" "+i+"\n");
		}
	}
}
class PillaThread extends Thread
{
	Printedto object;  //Printedto object
	PillaThread(Printedto parameter) 
	//Constructor has been created so as to pass Printedto's obj created in main() to object.
	//This ways helps to call toBePrintedThroughRun() method
	{
		this.object = parameter;
	}
	public void run()
	{
		object.toBePrintedThroughRun();
	}
}
public class MultiThread_Synchronized 
{
	public static void main(String[] args) {
		Printedto obj=new Printedto();
		PillaThread ptd1=new PillaThread(obj);
		PillaThread ptd2=new PillaThread(obj);
		PillaThread ptd3=new PillaThread(obj);
		PillaThread ptd4=new PillaThread(obj);
		ptd1.start();
		ptd2.start();
		ptd3.start();
		ptd4.start();
	}
}

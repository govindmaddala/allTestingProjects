class Threadclass extends Thread
{
	//Thread t=currentThread();
	public void run()
	{
		//Thread t=currentThread();
		//System.out.println(t); //for tc1 it is 0 and for tc2 it is 1
		for(int i=0;i<=5;i++)
		{
			Thread t=currentThread();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			System.out.println("Name:-> "+t.getName()+" Priority-> "+t.getPriority()+" "+i);
			//System.out.println("This is Threadclass's Method");
		}
	}
}

public class Threadfunctions {

	public static void main(String[] args) 
	{
		Threadclass tc1=new Threadclass();
		Threadclass tc2=new Threadclass();
		Threadclass tc3=new Threadclass();
		Threadclass tc4=new Threadclass();
		//System.out.println("ID is"+tc1.getId()); //13
		
		//System.out.println("Initial name is"+tc1.getName()); //0
		//tc1.setName("Govi");
		//System.out.println("Final name is "+tc1.getName()); //Govi
		
		//System.out.println("Initial priority is "+tc1.getPriority()); //5
		//tc1.setPriority(6);
		//System.out.println("Final priority is "+tc1.getPriority()); //6
		
		//both goes simultaneously but not one after another
		//tc1.start();
		//tc2.start();
		
		//using join() results in tc2 starts after completion of execution of tc2 
		//System.out.println("Status of tc1 before tc1 is: "+tc1.isAlive());//false
		tc1.start();
		//System.out.println("Status of tc1 before join is: "+tc1.isAlive());//true
//		try 
//		{
//			tc1.join();
//		}
//		catch (Exception e)
//		{
//		}
		//System.out.println("Status of tc1 after join is: "+tc1.isAlive());//false
		//System.out.println("Status of tc2 after join is: "+tc2.isAlive());//false
		tc2.start();
		//System.out.println("Final Status of tc1 is: "+tc1.isAlive());//false
		//System.out.println("Final Status of tc2 is: "+tc2.isAlive());//true
		tc3.start();
		tc4.start();
	}
	
	
}

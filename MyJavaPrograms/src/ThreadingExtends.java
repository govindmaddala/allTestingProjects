class Xxx extends Thread
{
	public void run()
	{
		System.out.println("Over-ride of Thread's method by Xxx's taken");
	}
}


public class ThreadingExtends 
{

	public static void main(String[] args) 
	{
		Xxx obj=new Xxx();
		obj.run(); //Over-ride of Thread's method by Xxx's taken
		obj.start(); //Over-ride of Thread's method by Xxx's taken
	}

}

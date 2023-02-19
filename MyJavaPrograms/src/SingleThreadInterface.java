class Xx implements Runnable
{
	public void run()
	{
		System.out.println("Over-ride of Thread's method by Xxx's taken");
	}
}
public class SingleThreadInterface {

	public static void main(String[] args) 
	{
		Xx x=new Xx();
		Thread t=new Thread(x);
		t.start();   //Over-ride of Thread's method by Xxx's taken
		t.run();    //Over-ride of Thread's method by Xxx's taken
		x.run();   //Over-ride of Thread's method by Xxx's taken
	}

}

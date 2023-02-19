/*Unlike Synchronized method and block,here we can call method directly without
creating object 
*/
class Printable
{
	synchronized static void meth()
	{
		Thread dr=Thread.currentThread();
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e) {}
			System.out.println("Name:"+dr.getName()+" "+i);
		}
	}
}
class Pillodu extends Thread
{
	public void run()
	{
		Printable.meth();
	}
}
public class Multithread_static_synch {

	public static void main(String[] args) {
		Pillodu o1=new Pillodu();
		Pillodu o2=new Pillodu();
		Pillodu o3=new Pillodu();
		Pillodu o4=new Pillodu();
		o1.start();
		o2.start();
		o3.start();
		o4.start();
	}

}

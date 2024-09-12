package cp;

public class multith {

public static void main(String[] args) {
	thread1 t=new thread1();
	t.start();
	
	thread2 t1=new thread2();
	t1.start();
	try {
		t1.join();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	System.out.println("this is java");
	
	
}
}
class thread1 extends Thread {
	public void run()
	{
		try {
		for (int i=0;i<10;i++)
		{
			System.out.println("this is run method");
			Thread.yield();
		}
		}
		catch(Exception e)
		{
			System.out.println("thisi is sleeping");
		}
		
	}
}
class thread2 extends Thread {
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("this is run2");
		}
	}
}


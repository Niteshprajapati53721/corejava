package multithreading;

public class runableint {
	public static void main(String[] args) {
		runableclass r=new runableclass();
		Thread t=new Thread(r);
		t.start();
		runnableclass2 r1=new runnableclass2();
Thread t1=new Thread(r1);
		t1.start();
	}

}
class runableclass implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{
		System.out.println(i);
		
	}
	}
	
	
}
class runnableclass2 implements Runnable 
{

	@Override
	public void run() {
		for(int i=0;i<30;i++)
		{
		
		System.out.println("this is runable interface");
	}
	}
	
}
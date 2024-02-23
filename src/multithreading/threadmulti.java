package multithreading;

public class threadmulti {

	public static void main(String[] args) {
		threadclass t=new threadclass();
		t.start();
		threadlass2 t1=new threadlass2();
		t1.start();
	}
}
class threadclass extends Thread
{
	@Override
	public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
	}
	}
	
}
class threadlass2 extends Thread
{
	@Override
	public void run() {
		for(int i=0;i<20;i++)
		{
			System.out.println("this is second class");
		}
	}
}

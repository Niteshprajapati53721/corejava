package exception;

public class throwsexp {
	public static void main(String[] args) {
		
		throwsexception ex=new throwsexception();
		try {
			ex.exp();
			System.out.println("this is try block");
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("this is catch bock");
		}
		finally {
			System.out.println("this is finally block");
		}
		
		System.out.println("this is line after exception");
		
	}
}
class throwsexception
{
	public void exp()  throws Exception
	{
		int a=20;
		int b=20/0;
		System.out.println(b);
	}
}
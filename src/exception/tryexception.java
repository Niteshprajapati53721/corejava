package exception;

public class tryexception {

	public static void main(String[] args) {
		
		tryexp ex=new tryexp();
		ex.exp();
	}
}
class  tryexp{
	public void exp()
	{
		int a=10;
		try {
		int b=	a/2;
		System.out.println(b);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}

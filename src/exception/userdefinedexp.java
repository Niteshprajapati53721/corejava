package exception;


public class userdefinedexp {


	public static void main(String[] args) {
		int age=19;
		if (age>18)
		{
			System.out.println("eligible to vote");		}
		else
		{
			throw new invalidexception("this is not eligible !....");
		}
	}

}
class invalidexception extends RuntimeException{
	public invalidexception(String sg)
	{
		super(sg);
	}
}

package thane;

public class palindrome {

	public static void main(String[] args) {
		String str="naman";
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)==true)
		{
			System.out.println("this is palindrome");
		}
		else
		{
			System.out.println("this is not a palindrome");
		}

	}

}

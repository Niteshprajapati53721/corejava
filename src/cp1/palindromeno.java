package cp1;

import java.util.Scanner;

public class palindromeno {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		n=sc.nextInt();
		int a=n;
		int pal=0;
		while(n>0)
		{
			int rem=n%10;
			pal=pal*10+rem;
			n=n/10;
		}
		if(a==pal)
		{
		System.out.println("this is palindrome");
	}
		else
		{
			System.out.println("this is not a palindrome");
		}

}
}

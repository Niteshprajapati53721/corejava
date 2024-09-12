package cp;

import java.util.Scanner;

public class palind {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	int count=0;
	int a=n;
	int pal=0;
	while(a>0)
	{
		int que=a%10;
		pal=pal*10+que;
		a=a/10;
		
	}
	if(n==pal)
	{
		System.out.println("this is palindrome");
	}
	else
	{
		System.out.println("this is not a palindrome no");
	}
}
}

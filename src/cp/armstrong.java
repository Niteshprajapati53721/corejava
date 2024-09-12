package cp;

import java.util.Scanner;

public class armstrong {
public static void main(String[] args) {
	int x;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	x=sc.nextInt();
	int count=0;
	int a=x;
	int n=x;
	
	int arm=0;
	while(a>0)
	{
		a=a/10;
		count++;
		
	}
	while(n>0)
	{
		int rem=n%10;
		arm=arm+(int)Math.pow(rem, count);
		n=n/10;
		
	}
	if(x==arm)
		{
		System.out.println("this is armstrong no");
		
	}
	else 
	{
		System.out.println("this is not a armstrong no");
	}
}
}

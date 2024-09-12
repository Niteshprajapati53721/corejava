package cp;

import java.util.Scanner;

public class primeno {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	int count=0;
	if(n>1)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
		System.out.println("this is prime no");	
		}
		else
		{
			System.out.println("this is not a prime no");
		}
	}
	else 
	{
		System.out.println("this is not a prime no");
	}
}
}

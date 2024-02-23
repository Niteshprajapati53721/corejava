package cp;

import java.util.Scanner;

public class newprimeno {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	a=sc.nextInt();
	int check=0;
	if(a>0)
	{
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				check++;
			}
		}
	
	if(check!=0)
	{
		System.out.println("this is not a primeno");
	}
	else 
	{
		System.out.println("this is prime no");
	}
	}
	else
	{
		System.out.println("this is not a prime no");
	}
}
}

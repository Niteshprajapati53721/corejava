package cp1;

import java.util.Scanner;

public class armstrongno {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		int arm=n;
		int a=n;
		int pow=0;
		int armstrong=0;
		while(arm>0)
		{
			arm=arm/10;
			pow++;
		}
		
		
		while(a>0)
		{
			int rem=a%10;
			armstrong=armstrong+(int)Math.pow(rem, pow);
			a=a/10;
			
		}
		if(n==armstrong)
		{
			System.out.println("this is armstrong number");
		}
		else
		{
			System.out.println("this is not a armstrong no");
		}
	}

}

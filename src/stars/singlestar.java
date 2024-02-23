package stars;

import java.util.Scanner;

public class singlestar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of diamond");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=n;j>i;j--)
		{
			System.out.print(" ");
			
		}
		for(int j=0;j<=i;j+=2)
		{
		System.out.print("*");	
		}
		System.out.println();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(" ");
			
		}
		for(int j=n;j>i;j-=2)
		{
		System.out.print("*");	
		}
		System.out.println();
	}
	}
}

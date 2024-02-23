package numbers;

import java.util.Scanner;

public class palindromno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int x=sc.nextInt();
		int a=x;
		int pal=0;
		
	while(a>0)
	{
		int rem=a%10;
		pal=pal*10+rem;
		a=a/10;
	}
	if(x==pal)
	{
		System.out.println("this is palindrom no");
		
	}
	else 
	{
		System.out.println("this is not a palindrom no");
	}
	}
	

}

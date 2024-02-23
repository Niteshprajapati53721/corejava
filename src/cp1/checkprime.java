package cp1;

import java.util.Scanner;

public class checkprime {
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter your number");
		n=sc.nextInt();
		int check=0;
		if(n>0) {
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					check++;
					
				}
			}
			if(check!=0)
			{
				System.out.println("this is not a prime no");
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

package numbers;

import java.util.Scanner;

public class primeno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int n=sc.nextInt();
	int count=0;
	if(n>0)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				count++;
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

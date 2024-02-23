package numbers;

import java.util.Scanner;

public class armstrongno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int x=sc.nextInt();
		int a=x;
		int n=x;
	int arm=0;
	     int count=0;
	    while(n!=0)
	    {
	    
	    		n=n/10;
	    	count++; 	
	    }
	    while(a>0)
	    {
	    	int rem=a%10;
	    	arm=arm+(int)Math.pow(rem, count);
	    	a=a/10;
	    }
	    
	   if(x==arm)
	   {
		   System.out.println("this is armstrong number");
	   }
	   else
	   {
		   System.out.println("this is not a armstrong number");
	   }
	     
	}

}

package cp;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		
		name=sc.nextLine();
		String s=name.toLowerCase();
		int c=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
			{
				c++;
			}
			else
			{
			
				System.out.print(s.charAt(i));
		}
		}
		System.out.println();
		System.out.println(c);
		
		String replaced=s.replaceAll("[aeiou]", " ");
		System.out.println(replaced);
	}
	
}

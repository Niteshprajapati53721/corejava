package cpractice;

import java.util.HashSet;

public class revint {
	public static void main(String[] args) {
		int a=35648628;
		HashSet<Integer> b=new HashSet();
		while(a>0)
		{
			int rem=a%10;
			if(rem%2==0)
			{
				b.add(rem);
			}
			a=a/10;
		}
		System.out.print(b);
	}

}

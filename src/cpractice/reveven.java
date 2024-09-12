package cpractice;

import java.util.HashSet;
import java.util.Set;

import collectionframework.Hashset;

public class reveven {

	public static void main(String[] args) {
		int a[]= {1,2,4,6,8,4,5};
		Set< Integer> s=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				s.add(a[i]);
				
			}
		}
		System.out.print(s);

	}

}

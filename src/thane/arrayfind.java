package thane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import collectionframework.Hashset;

public class arrayfind {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,3,5,7,8,5,3};
		int dupli=0;
		Set<Integer> s=new HashSet();
		Set<Integer> ls=new LinkedHashSet();
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		s.add(arr[i]);
		l.add(arr[i]);
		ls.add(arr[i]);
		}
		System.out.println(s);
		System.out.println(l);
		System.out.print(ls);
		
	
	Arrays.sort(arr);
	for(int i:arr)
	{
		System.out.print(i+" ");
	}

}
}

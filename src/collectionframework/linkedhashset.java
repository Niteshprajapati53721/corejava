package collectionframework;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(44);
		s.add(34);
		s.add(34);
		s.add(987);
		System.out.println(s);
		
	}

}

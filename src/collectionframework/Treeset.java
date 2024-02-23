package collectionframework;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
	
	SortedSet<Integer> ss=new TreeSet<Integer>();
	ss.add(64);
	ss.add(56);
	ss.add(64);
	ss.add(98);
	ss.add(34);
	ss.add(34);
	System.out.println(ss);
	}

}

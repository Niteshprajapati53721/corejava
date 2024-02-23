package collectionframework;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
	LinkedList<Integer> l=new LinkedList<Integer>();
	l.add(23);
	l.add(56);
	l.add(78);
	l.add(67);
	System.out.println(l);
	l.clear();
	System.out.println(l);
	}
}

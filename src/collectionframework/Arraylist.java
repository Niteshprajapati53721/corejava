package collectionframework;


import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<Integer>() ;
		l.add(55);
		l.add(90);
		l.add(30);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.add(1, 55);
		System.out.println(l);
	}

}

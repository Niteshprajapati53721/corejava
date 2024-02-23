package collectionframework;

import java.util.Stack;

public class stack {
public static void main(String[] args) {
	Stack<Integer> s=new Stack<Integer>();
	s.push(34);
	s.add(34);
	s.add(98);
	s.push(45);
	System.out.println(s);
	s.pop();
	System.out.println(s);
}
}

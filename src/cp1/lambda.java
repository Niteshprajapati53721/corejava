package cp1;
interface ab{
	void show();
}
public class lambda {
public static void main(String[] args) {
	ab a=()->{
		
		System.out.println("this  is lambda expression");
	};
	a.show();
}
}

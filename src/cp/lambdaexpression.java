package cp;
//lambda expression
interface one{
	public void show(int a,String b);
}
public class lambdaexpression {
public static void main(String[] args) {
	one o=(a,b)->{
		System.out.println("this is lambda expression"+b);
	};
	o.show(2,"nitesh");
}
}

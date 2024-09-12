package cp;

interface two{
	void disp(String a);
}
public class lambda {
	public static void main(String[] args) {
		two o=(a)->{
			System.out.println("this is name"+a);
		};
o.disp("nitesh");

}
}

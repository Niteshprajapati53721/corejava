package cp;

public class inner {

	String name="nitesh";
	class inneer{
		void show() {
		System.out.println("this is safety class"+name);
	}
	}
	void disp() {
		System.out.println("this is outer class");
	}
	
	public static void main(String[] args) {
		inner i=new inner();
		i.disp();
		inner.inneer ii=i.new inneer();
		ii.show();
	}
}

package cp1;

class outer
{
	private String a ="nitesh";
	void show()
	{
		System.out.println("this is outer class");
	}
	class innerclass
	{
		void show()
		{
			System.out.println("this is inner class");
			System.out.println("this is "+a);
		}
	}
}
public class innerclass {
	public static void main(String[] args) {
		outer o=new outer();
		outer.innerclass inner=o.new innerclass();
		inner.show();
	}

}

package cp;

//inner class
 class outerclass
{
	
	public void show()
	{
		System.out.println("this is outer class");
	}
	class inner{
		private int a=10;
		public void num()
		{
			while(a>0)
			{
				System.out.println("this is inner class");
				a--;
			}
		}
	}
}
public class outer {

	public static void main(String []args)
	{
		outerclass oc=new outerclass();
		oc.show();
		outerclass.inner ic=oc.new inner();
		ic.num();
		
		
	}
}

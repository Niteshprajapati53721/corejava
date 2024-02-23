package cp;

//annonymus class
interface nitesh{
	public void show();
}
public class annonymusclass {
	public static void main(String []args)
	{
		nitesh n=new nitesh(){
			public void show()
			{
				System.out.println("this is annonymus class");
			}
			
		};
		n.show();
	}

}

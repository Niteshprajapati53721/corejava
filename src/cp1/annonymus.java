package cp1;
interface a{
	void show();
}
public class annonymus {
	public static void main(String[] args) {
		a ab=new a(){
			 public void show()
			{
				System.out.println("i am from annonymus class");
			}
		};
		ab.show();
	}

}

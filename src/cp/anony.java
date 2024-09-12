package cp;

interface three{
	void get();
	void set(int a);
	
}
public class anony {
public static void main(String[] args) {
	three a=new three(){

		@Override
		public void get() {
			System.out.println("this is get method");
			
		}

		@Override
		public void set(int a) {
		System.out.println("this is set method");
		
			
		}
	
		
	};
	a.get();
	a.set(12);
}
}

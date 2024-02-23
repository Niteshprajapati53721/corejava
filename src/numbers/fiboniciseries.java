package numbers;

public class fiboniciseries {

	public static void main(String[] args) {
		System.out.print("0"+" "+"1");
		int a=0;
		int b=1;
		for(int i=2;i<100;i++)
		{
			int c=a+b;
			if(c>1000)
			{
			break;	
			}
			System.out.print(c+" ");
			
			a=b;
			b=c;
		}
	}
}

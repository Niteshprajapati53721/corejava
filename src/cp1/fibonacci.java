package cp1;

public class fibonacci {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		int a=0;
		int b=1;
	int d=0;
		while(a<1000)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			d++;
			
			if(d==100)
			{
			break;
			}
		}
	}

}

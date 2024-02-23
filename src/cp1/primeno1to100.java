package cp1;

public class primeno1to100 {
public static void main(String[] args) {
	int n=0;
	for (int i=2;i>0;i++)
	{
		int check=0;
		for (int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				check++;
			}
		}
			if(check==0)
			{
			System.out.println(i);
			n++;
			}
			if(n==100)
			{
				break;
			}
		}
	
}
}

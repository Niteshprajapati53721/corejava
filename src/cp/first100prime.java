package cp;

public class first100prime {
	public static void main(String[] args) {
		
		int c=0;
		for(int i=2;i>0;i++)
		{
			int check=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					check++;
				}
			}
			if(check==0)
			{
			
				System.out.println(i);
				c++;
				if(c==100)
				{
					break;
				}
				
			}
		}
		
	
	}

}

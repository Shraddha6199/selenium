package logical_program;

public class prime_no_2 
{
	public static void main(String[] args) 
	{
		int org=9;
		int count=1;
		
		for(int i=2; i<org;i++)
		{
			if(org%i==0)
			{
				count++;
				break;
			}
		}
		if(count==2)
		{
			System.out.println("no is not prime");
		}
		else
		{
			System.out.println("no is prime");
		}
	}

}

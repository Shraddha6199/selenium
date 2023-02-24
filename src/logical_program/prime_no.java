package logical_program;

public class prime_no 
{
	public static void main(String[] args)
	{
		int org=7;         //1    23456    7
		int count=0;
		for(int i=2;    i<org;    i++  )
		{
			if(org%i==0)
			{
				count++;
				break;
			}
			
		}
		if(count==1) 
		{
			System.out.println(" no is not prime");
		}
		else
		{
			System.out.println("no is prime");
		}
	}

}

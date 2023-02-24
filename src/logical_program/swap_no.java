package logical_program;

public class swap_no
{
	public static void main(String[] args) 
	{
	int	a=20;
	int	b=10;
	a=a+b;               //a=30
	b=a-b;                 //b=30-10=20
	a=a-b;                 //a=30-20=10
		
	System.out.println(a);
	System.out.println(b);
	}

}

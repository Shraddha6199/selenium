package logical_program;

public class white_spaces
{
	public static void main(String[] args) 
	{
		String org="j m n ";
		int count=0;
		
		for(int i=0; i<=org.length()-1;i++)
		{
			   char value=org.charAt(i);
			   if(value==' ')
			   {
				   count++;
			   }
		}
		System.out.println(count);
	}

}

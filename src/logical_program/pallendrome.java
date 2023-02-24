package logical_program;

public class pallendrome
{
	public static void main(String[] args) 
	{
		String org="mom";                 //level madam nun 
		String rev="";
		
		for(int i=org.length()-1; i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("string is pallendrome");
		}
		else
		{
			System.out.println("string is not pallendrome");
		}
	}

}

package logical_program;


public class reverse_string 
{
	public static void main(String[] args)
	{
	String org="Virat";
	String rev="  ";
	
	for(int i=org.length()-1; i>=0 ;i--)
	{
		rev =rev+org.charAt(i)+" ";
   }
	System.out.println(rev);
}
	
}

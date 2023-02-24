package TestNG_Assertions;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo8
{
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
	
		String S1="hello";
		String S2="jk";
		String S3="v";
		
		soft.assertEquals(S2, S1);
		soft.assertNotEquals(S2, S1);
		soft.assertEquals(S3, S1);
		soft.assertNotEquals(S3, S1);
		
		soft.assertAll();
		

}
}
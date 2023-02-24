package TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo7
{
	//drawback of assert class
	@Test
	public void TC1()
	{
		String S1="hello";
		String S2="jk";
		String S3="v";
		
		Assert.assertNotEquals(S2, S1);
		Assert.assertEquals(S2, S1);
		Assert.assertEquals(S3, S1);
		Assert.assertNotEquals(S3, S1);
		
	}

}

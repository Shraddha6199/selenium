package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_Broker_Insurance_Webpage 
{
	//POM2
		//1) Data members/Global Variables should be declared globally with access level private by using @findby 
		
		@FindBy(xpath="//h4[text()='saradeg41@gmail.com']") private WebElement Signedinas;
		
		@FindBy(xpath="//input[@class='btn btn-danger']")  private WebElement LoginButton;
		
		// 2) Initialize within a constructor with access level public using pagefactory
		public Insurance_Broker_Insurance_Webpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//3) Utilize within a method with access level public
	   public String getEmail()
	   {
		   String ActualResult=Signedinas.getText();                //saradeg41@gmail.com
		   return ActualResult;                                                     //  //saradeg41@gmail.com
	   }
	    public void logout()
	    {
	    	LoginButton.click();
	    }

}

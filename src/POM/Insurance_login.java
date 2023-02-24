package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insurance_login
{
	//pom1
	
	//1) Data members/Global Variables should be declared globally with access level private by using @findby ==Annotation
	
@FindBy(xpath="//input[@id='email']")	 private WebElement Email;    //private WebElement Email= driver.findElement(By.xpath(""//input[@id='email']");

@FindBy(xpath="//input[@id='password']")  private WebElement Password;   //

@FindBy(xpath="//input[@name='submit']")  private WebElement LoginButton;

//2)  Initialize within a constructor with access level public using pagefactory
 public Insurance_login(WebDriver driver)
 {
	 PageFactory.initElements( driver,this);
 }
 
 //3) Utilize within a method with access level public
  public void EnterEmail(String EmailAddress)
  {
	  Email.sendKeys(EmailAddress);
  }
  public void EnterPassword(String Psw)
 {
	Password.sendKeys(Psw);
}
  public void LoginBttn()
  {
	  LoginButton.click();
  }
}

package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginp {
	

	@FindBy(xpath = "//input[@name='username']") private WebElement UserName;
	
	@FindBy(xpath = "//input[@name='password']") private WebElement Pass;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement Sub;
	

	public loginp(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
	}
	public void SUN(String UN) 
	{
		UserName.sendKeys(UN);
	}
	public void PW(String PAS) 
	{
		Pass.sendKeys(PAS);
	}
	public void CLICK( )
	{
		Sub.click();;
	}

}

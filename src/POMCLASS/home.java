package POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home 
{

	@FindBy(xpath = "//span[text()='Admin']") private WebElement Button;
	
	public home(WebDriver Driver) 
	{
		PageFactory.initElements(Driver, this);
	}
	
	public void Admin() 
	{
		Button.click();
	}
}

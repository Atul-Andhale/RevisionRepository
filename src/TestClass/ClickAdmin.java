package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POMCLASS.home;
import POMCLASS.loginp;
import kiteBase.Base;
import kiteUtility.Utility;

public class ClickAdmin extends Base
{
	home hm;
	loginp lg;
	
	@BeforeClass
	public void openBrowserclick() throws EncryptedDocumentException, IOException 
	{
		openBrowser();
		hm=new home(driver);
		lg=new loginp(driver);
		
	}
	
	@BeforeClass
	public void log() throws EncryptedDocumentException, IOException 
	{

		  lg.SUN(Utility.readDataFromExcel(8, 0));
			lg.PW(Utility.readDataFromExcel(8, 1));
			lg.CLICK();
	  }
	
  @Test
  public void f() 
  {
	hm.Admin(); 
  }
}

package GodaddyProject.Godaddy;

	import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import GodadaddyAccount.Createaccount;
	import GodaddyProject.Godaddy.BaseClass;

	public class CreateAccountTest extends BaseClass 
	{

		@BeforeTest
		public void bTest() throws IOException 
		{

			launchBrowser();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
		}

		@Test
		public void creatingAcnt() throws Throwable 
		{

			Createaccount ca = new Createaccount(driver);
			ca.fillCreateaccountForm(prop.getProperty("Email"), prop.getProperty("Fname"),
					prop.getProperty("Pwd"));
						ca.clickSubmit();
			
			
		}

		@AfterTest
		public void aTest() 
		{
			//driver.close();
		}
}
package GodaddyProject.Godaddy;

	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import GodaddyProject.Godaddy.BaseClass;

	public class Login extends BaseClass 
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
			
			  driver.findElement(By.xpath(prop.getProperty(""))).click();
		      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		       			  
		}

		@AfterTest
		public void aTest() 
		{
			//driver.close();
		}
}
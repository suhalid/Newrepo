package GodadaddyAccount;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import GodaddyProject.Godaddy.BaseClass;


public class Createaccount extends BaseClass {
	  WebDriver driver;
	  Properties prop;
	  BaseClass configfile;
   		public Createaccount(WebDriver driver) {
			this.driver=driver;
		}	
		public void fillCreateaccountForm(String FirstName, String EmailAddress, String Password) {
			configfile = new BaseClass();
		       prop = configfile.init_prop();
		  
		      driver.findElement(By.xpath(prop.getProperty("Signin_xpath"))).click();
		      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		      driver.findElement(By.xpath(prop.getProperty("createaccount_xpath"))).click();
		      //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(EmailAddress);
				driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(FirstName);
				driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(Password);
			    
		}
		
		public void clickSubmit() {
			configfile = new BaseClass();
		    prop = configfile.init_prop();
			driver.findElement(By.xpath(prop.getProperty("createnewaccount_xpath"))).click();
			 
		}


}

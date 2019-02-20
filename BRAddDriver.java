package BRpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertTrue;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class BRAddDriver
{
	public static void main(String[] args)
	{
		//WebDriver driver = new FirefoxDriver(); 
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://www.ekdantsolutions.com/demo/balaji_demo/admin/index.php");
		driver.manage().window().maximize();
				
		WebElement uname = driver.findElement(By.id("txtadminusername"));
		uname.sendKeys("Superadmin");
				
		WebElement pswd = driver.findElement(By.id("txtadminpassword"));
		pswd.sendKeys("Admin.100");
				
		WebElement btn = driver.findElement(By.id("btnsubmit"));
		btn.click();
				
		//Driver Master
		WebElement model = driver.findElement(By.linkText("Driver Master"));
				
		Actions action = new Actions(driver);
		action.moveToElement(model).build().perform();
		driver.findElement(By.linkText("Add Drivers")).click();
				
		//Driver's name
		WebElement dname = driver.findElement(By.id("txtdname"));
		dname.sendKeys("Aniket Suhas Keni");
				
		//Driver's photo
		WebElement dphoto = driver.findElement(By.id("driverimg"));
		dphoto.click();
				
		//Driver's address
		WebElement daddr = driver.findElement(By.id("txtdadd"));
		daddr.sendKeys("Room no.1, Gadre chambers, Sadashiv peth, Pune");
				
		//Driver's contact no.
		WebElement dcont = driver.findElement(By.id("txtcontact"));
		dcont.sendKeys("+919998979695");
				
		//Driver's License no.
		WebElement licno = driver.findElement(By.id("txtlicno"));
		licno.sendKeys("AKDL123");
				
		//Driver's License Copy
		WebElement dlic = driver.findElement(By.id("driverlic"));
		dlic.click();
				
		//Driver's License expiry date
		WebElement lexp = driver.findElement(By.id("txtlicexp"));
		lexp.sendKeys("16-7-2016");
				
		//Submit button
		//WebElement btnsub = driver.findElement(By.id("btnsubmit"));
		//btnsub.click();
				
		//Reset the fields
		//WebElement btnres = driver.findElement(By.id("txtreset"));
		//btnres.click();
				
		//View Drivers link
		//<a href="http://ekdantsolutions.com/demo/balaji_demo/admin/mod_drivers/mod_viewdrivers.php">View Drivers</a>
		//driver.findElement(By.linkText("View Drivers")).click();
	}
}
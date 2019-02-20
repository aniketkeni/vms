package BRpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertTrue;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class BRAddTyre
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
				
		//Tyre Inventory
		WebElement model = driver.findElement(By.linkText("Tyre Inventory"));
				
		Actions action = new Actions(driver);
		action.moveToElement(model).build().perform();
		driver.findElement(By.linkText("Add Company Name")).click();
				
		//Company Name
		WebElement cname = driver.findElement(By.id("txtcname"));
		cname.sendKeys("MRF");
				
		//Submit button
		WebElement btnsub = driver.findElement(By.id("btnsubmit"));
		btnsub.click();
				
		//Reset the fields
		//WebElement btnres = driver.findElement(By.id("txtreset"));
		//btnres.click();
				
		//View Company Details
		//<a href="http://ekdantsolutions.com/demo/balaji_demo/admin/mod_tyres/mod_viewcompany.php">View Company Details</a>
		//driver.findElement(By.linkText("View Drivers")).click();
				
	}
}

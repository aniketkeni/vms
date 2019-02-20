package BRpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import static org.junit.Assert.assertTrue;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class BRViewModel
{
	public static void main(String[] args)throws Exception
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ekdantsolutions.com/demo/balaji_demo/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.id("txtadminusername"));
		uname.sendKeys("Superadmin");
		
		WebElement pswd = driver.findElement(By.id("txtadminpassword"));
		pswd.sendKeys("Admin.100");
		
		WebElement btn = driver.findElement(By.id("btnsubmit"));
		btn.click();
		
		WebElement model = driver.findElement(By.linkText("Model Master"));
		
		Actions action = new Actions(driver);
		action.moveToElement(model).build().perform();
		driver.findElement(By.linkText("View Model")).click();
		
		WebElement dd = driver.findElement(By.name("example_length"));
		Select dropdown = new Select(dd);
		Thread.sleep(3000);
		
		// by index
		//dropdown.selectByIndex(1);
		//Thread.sleep(3000);
		
		// by value
		//dropdown.selectByValue("25");
		//Thread.sleep(3000);
				
		//by text
		dropdown.selectByVisibleText("25");
		Thread.sleep(3000);
		
		//Add Models link
		//<a href="http://ekdantsolutions.com/demo/balaji_demo/admin/mod_modmaster/mod_addmodel.php">Add Model</a>
		//driver.findElement(By.linkText("Add Model")).click();
		
	}
}

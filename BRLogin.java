package BRpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
//import static org.junit.Assert.assertTrue;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class BRLogin
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
		
		WebElement model = driver.findElement(By.linkText("Model Master"));
		
		Actions action = new Actions(driver);
		action.moveToElement(model).build().perform();
		driver.findElement(By.linkText("Add Model")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txtmname")));
		
		//Model name
		WebElement mname = driver.findElement(By.id("txtmname"));
		mname.sendKeys("Tata");
		
		//hub greasing cycle
		WebElement hgs = driver.findElement(By.id("txthcyclekm"));
		hgs.sendKeys("15000");
		
		WebElement ahgs1 = driver.findElement(By.id("txthcyclekm1"));
		ahgs1.sendKeys("8500");
		
		WebElement ahgs2 = driver.findElement(By.id("txthcyclekm2"));
		ahgs2.sendKeys("9500");
		
		//oil change cycle
		WebElement occ = driver.findElement(By.id("txtocyclekm"));
		occ.sendKeys("10000");
		
		WebElement aocc1 = driver.findElement(By.id("txtocyclekm1"));
		aocc1.sendKeys("7500");
		
		WebElement aocc2 = driver.findElement(By.id("txtocyclekm2"));
		aocc2.sendKeys("9000");

		//tyre change cycle
		WebElement tcc = driver.findElement(By.id("txttyreckm"));
		tcc.sendKeys("8000");
		
		WebElement atcc1 = driver.findElement(By.id("txttyreckm1"));
		atcc1.sendKeys("6500");
		
		WebElement atcc2 = driver.findElement(By.id("txttyreckm2"));
		atcc2.sendKeys("7000");
		
		//wheel alignment
		WebElement wa = driver.findElement(By.id("txtwheelkm"));
		wa.sendKeys("20000");
		
		WebElement awa1 = driver.findElement(By.id("txtwheelkm1"));
		awa1.sendKeys("15000");
		
		WebElement awa2 = driver.findElement(By.id("txtwheelkm2"));
		awa2.sendKeys("18000");
		
		//Tyre rotation - front
		WebElement trf = driver.findElement(By.id("txtftyrekm"));
		trf.sendKeys("20000");
		
		WebElement atrf1 = driver.findElement(By.id("txtftyrekm1"));
		atrf1.sendKeys("15000");
		
		WebElement atrf2 = driver.findElement(By.id("txtftyrekm2"));
		atrf2.sendKeys("18000");
		
		//Tyre rotation - Rear1
		WebElement trr = driver.findElement(By.id("txtr1tyrekm"));
		trr.sendKeys("20000");
		
		WebElement atrr1 = driver.findElement(By.id("txtr1tyrekm1"));
		atrr1.sendKeys("15000");
		
		WebElement atrr2 = driver.findElement(By.id("txtr1tyrekm2"));
		atrr2.sendKeys("18000");
		
		//Tyre rotation - Rear2
		WebElement tr = driver.findElement(By.id("txtr2tyrekm"));
		tr.sendKeys("20000");
		
		WebElement atr1 = driver.findElement(By.id("txtr2tyrekm1"));
		atr1.sendKeys("15000");
		
		WebElement atr2 = driver.findElement(By.id("txtr2tyrekm2"));
		atr2.sendKeys("18000");
		
		//Lift Exel
		WebElement le = driver.findElement(By.id("txtletyrekm"));
		le.sendKeys("20000");
		
		WebElement ale1 = driver.findElement(By.id("txtletyrekm1"));
		ale1.sendKeys("15000");
		
		WebElement ale2 = driver.findElement(By.id("txtletyrekm2"));
		ale2.sendKeys("18000");
		
		//Battery rotation days
		WebElement br = driver.findElement(By.id("txtbatrotdays"));
		br.sendKeys("15");
		
		//Washing 
		WebElement wash = driver.findElement(By.id("txtwashdays"));
		wash.sendKeys("9");
		
		//Greasing 
		WebElement gre = driver.findElement(By.id("txtgreasdays"));
		gre.sendKeys("7");
		
		//Air
		WebElement air = driver.findElement(By.id("txtairdays"));
		air.sendKeys("5");
		
		//Submit the data
		WebElement btn1 = driver.findElement(By.id("btnsubmit"));
		btn1.click();

		//Assert - Model inserted successfully.
		//WebElement demo = driver.findElement(By.cssSelector("Model inserted successfully!"));
		//Assert.assertEquals(demo.getText(),"Model inserted successfully!");

		//Reset the fields
		//WebElement btn2 = driver.findElement(By.id("txtreset"));
		//btn2.click();
		
		//View Models link
		//<a href="http://ekdantsolutions.com/demo/balaji_demo/admin/mod_modmaster/mod_viewmodel.php">View Models</a>
		driver.findElement(By.linkText("View Models")).click();
		
		//driver.close();
		//driver.quit();
	}
}
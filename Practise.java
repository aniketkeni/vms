package BRpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practise
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com");
		driver.manage().window().maximize();
		driver.close();
	}
}
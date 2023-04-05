package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class RadioDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		 
		  ChromeOptions chromeoption= new ChromeOptions();
	       chromeoption.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(chromeoption);
			
			driver.get("https://artoftesting.com/samplesiteforselenium");
			Thread.sleep(2000L);
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id='male']")).isSelected());
			driver.findElement(By.cssSelector("input[id='male']")).click();
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id='male']")).isSelected());
		
		
		
	}

}

package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoSuggestiveDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);
		//Enter the letter BENG
		//verify if banglore option is present
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.cssSelector("[id='fromPlaceName']")).sendKeys("beng");
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector("[id='fromPlaceName']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("[id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
	System.out.println(driver.findElement(By.cssSelector("[id='fromPlaceName']")).getText());
	
	//javascript DOM can extract hidden element
	//because selenium can not find hidden element(Ajax implementation)
	//investigate the properties of object if it have any hidden text
	
	//javascriptExecutor
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String Value=" return document.getElementById(\"fromPlaceName\").value;";
	String text=(String) js.executeScript(Value);
	System.out.println(text);
	int i=0;
	//BENGLURU INTERNATION AIPORT
	while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")) {
		i++;
		driver.findElement(By.cssSelector("[id='fromPlaceName']")).sendKeys(Keys.DOWN);
		text=(String) js.executeScript(Value);
		System.out.println(text);
		if(i>10) {
			break;
		}
	}
	if(i>10) {
		System.out.println("Element not Found");
	}
	else {
		System.out.println("Element  Found");
	}
	}

}
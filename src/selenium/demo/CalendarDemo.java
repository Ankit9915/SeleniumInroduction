package selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CalendarDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000L);
		
		
	WebElement l=	driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']"));
	JavascriptExecutor je=(JavascriptExecutor)driver;
	je.executeScript("arguments[0].scrollIntoView()",l);
	l.click();
	
	//	Actions  a= new Actions(driver);
	//	a.moveToElement(dateclick).build().perform();
		
		
		while(!driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-current-month']")).getText().contains("March")) {
			driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-next-month']")).click();
		}
		List<WebElement> dates =driver.findElements(By.className("dayContainer"));
		
		for(int i=0;i<driver.findElements(By.className("dayContainer")).size();i++) {
			String text=driver.findElements(By.className("dayContainer")).get(i).getText();
			if(text.equalsIgnoreCase("27")){
				driver.findElements(By.className("dayContainer")).get(i).click();
				break;
			}
		}
		
	}

}

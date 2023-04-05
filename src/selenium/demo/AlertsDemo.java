package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);
		String text = "aman";

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		Thread.sleep(2000L);

		// handling alert 1st Type
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// 2nd Type

		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000L);

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}

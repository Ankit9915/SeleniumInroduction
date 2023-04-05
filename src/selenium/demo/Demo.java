package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create Driver object for chrome driver
		// invoke .exe file first

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		// for edge driver
		// System.setProperty("webdriver.edge.driver",
		// "C:\\edgeDriver\\msedgedriver.exe");

		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);

		// WebDriver driver = new EdgeDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); // checks if you are landed on correct url

		// System.out.println(driver.getPageSource());//print page source

		driver.navigate().to("http://facebook.com");
		// driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("hello selenium"); // by using id

		driver.findElement(By.name("pass")).sendKeys("bye selenium"); // by using name
		driver.findElement(By.linkText("Forgotten password?")).click(); // by using linktext

		driver.findElement(By.xpath("//*[@id='passContainer']")).sendKeys("humbg"); // by using xpath
		driver.findElement(By.cssSelector("#pass")).sendKeys("hello"); // by using css selector

		// driver.close();//It closes the current browser

		// driver.quit();//It closes all the browser opened by selenium
	}

}

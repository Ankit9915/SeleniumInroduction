package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownSample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// STATIC DROPDOWN EXAMPLE for this select and option are necessary

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);

		/*
		 * driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 * Select s= new Select(driver.findElement(By.xpath("//p/select")));
		 * s.selectByValue("BRA"); s.selectByIndex(13);
		 * s.selectByVisibleText("Afghanistan");
		 */

		// UPDATED DYNAMIC DROPDOWN

		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div/div[1]")).click();
		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']/div/div[1]")).getText());

		driver.findElement(By.xpath("//*[text()='From']")).click();
		driver.findElement(By.xpath("//*[text()='Bengaluru']")).click();
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//*[text()='Delhi']")).click();
		driver.findElement(By.xpath(
				"//div[@data-testid='undefined-month-August-2023']//div[ @data-testid='undefined-calendar-day-15']"))
				.click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

		// BASED ON INPUT DROPDOWN(Auto Suggest Drop Down)

		/*
		 * driver.get("https://www.makemytrip.com/");
		 * 
		 * 
		 * Thread.sleep(1000L);
		 * driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		 * driver.findElement(By.xpath("//div/div/input[@placeholder='From']")).sendKeys
		 * ("var"); Thread.sleep(2000L);
		 * driver.findElement(By.xpath("//ul[@role='listbox']/li[2]")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@id='toCity']")).click();
		 * 
		 * driver.findElement(By.xpath("//div[@role='combobox']/input")).sendKeys("mel")
		 * ; Thread.sleep(2000L);
		 * driver.findElement(By.xpath("//ul[@role='listbox']/li")).click();
		 * 
		 * int i=1; for(i=1;i<9;i++) {
		 * driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).
		 * click(); } Thread.sleep(2000L);
		 * driver.findElement(By.xpath("//div[@class='dateInnerCell']//p[text()='1']")).
		 * click(); driver.findElement(By.xpath("//*[text()='Search']")).click();
		 */

	}

}

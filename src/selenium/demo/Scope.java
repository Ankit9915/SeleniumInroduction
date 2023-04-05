package selenium.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1.Give me the count of links on the page(a)
		System.out.println(driver.findElements(By.tagName("a")).size());
		//2.Give me the count of links on footer section
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		
		//3.Give me the count of links on a particular section on footer
		WebElement columndriver=footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4.click on each link and checks if pages are opening  
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
			String clickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(5000L);
		}
		//opens all the tab
			Set<String> ids= driver.getWindowHandles(); 
			Iterator<String> it=ids.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
		}
		
		
	}



package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);

		// demo by using normal xpath
		/*
		 * driver.get("https://login.salesforce.com");
		 * driver.findElement(By.id("username")).sendKeys(("ankit"));
		 * driver.findElement(By.name("pw")).sendKeys("12345");
		 * 
		 * driver.findElement(By.xpath("//*[@id='Login']")).click();
		 * 
		 * System.out.println(driver.findElement(By.cssSelector("div#error.loginError"))
		 * .getText());
		 */

		// demo by using customized xpath
		/*
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gfder");
		 * driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("gfed");
		 * driver.findElement(By.xpath("//button[@name='login']")).click();
		 */

		// demo by using css //another way of writing css is tagname#Id(#id)

		/*
		 * driver.get("https://www.facebook.com/");
		 * driver.findElement(By.cssSelector("input[name='email']")).sendKeys("dsed");
		 * driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("derty");
		 * driver.findElement(By.cssSelector("button[name='login']")).click();
		 */

		// regular expression -xpath
		// syntax-://tagname[contains(@attribute='value')]
		// ex-://input[contains(@name,'username')]
		// css regular expression
		// syntax-://tagname[Attribute*='value'] ex-:input[name*='username']

		// traversing xpath example -://div[@class='SDkEP']/div[2]/textarea
		// driver.get("https://google.com");
		// driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/textarea")).click();
		// driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/textarea[@title='Search']")).sendKeys("cricbuzz");
		// driver.findElement(By.xpath("//input[@name='btnK']")).click();

		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input[id*='login1']")).sendKeys("asd");
		driver.findElement(By.cssSelector("input#password")).sendKeys("dgfr");
		driver.findElement(By.cssSelector("input[type*='submit']")).click();

		// xpath without tagname

		// *[text()='text']

		// css
		// tagname[attribute='value'] ex-:[class='value']
		// both # and . works for css

	}

}

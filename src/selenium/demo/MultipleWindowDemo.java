package selenium.demo;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the Chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1074236020%3A1679487858101557&authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Futm_source%3Dsign_in_no_continue%26pli%3D1&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//*[text()='Learn more']")).click();
		System.out.println(driver.getTitle());
		
		
		//all the window
		Set<String> ids= driver.getWindowHandles();
	   Iterator<String> it= ids.iterator();	
	   String pId=it.next();
	   String cId=it.next();
	   driver.switchTo().window(cId);
	   //child window
	   System.out.println(driver.getTitle());
	   
	   driver.switchTo().window(pId);
	   
	   //parent window
	   System.out.println(driver.getTitle());
	   
	   
	}

}

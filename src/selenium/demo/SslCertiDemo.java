package selenium.demo;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;
;


public class SslCertiDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		
		//Desired Capabilities
		//SSL Certificate
		
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");
		chromeoption.merge(capabilities);

		WebDriver driver = new ChromeDriver(chromeoption);

		//delete Cookies
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("SessionKey");
		
		//click on link
		//login page-verify login url
		
		//2 TakeScreenshot
		driver.get("http://google.com");
	File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("E:\\screenshot.png"));
		
		
		
		
	}

}

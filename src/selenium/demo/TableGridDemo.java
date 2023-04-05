package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TableGridDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/65903/miw-vs-upw-eliminator-womens-premier-league-2023 ");
		
	WebElement table=	driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int rowcount=table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
	
	int count= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	for(int i=0;i<count-2;i++) {
	String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	int valueInteger=Integer.parseInt(value);
	sum=sum+valueInteger;
	}
	//System.out.println(sum);
	String extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int extraValue=Integer.parseInt(extra);
	int totalScore=sum+extraValue;
	System.out.println(totalScore);
	String actualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	int actualTotalValue=Integer.parseInt(actualTotal);
	if(actualTotalValue==totalScore) {
		System.out.println("Count Matched");
	}else {
		System.out.println("Count Matched Failed");
	}
	}

}

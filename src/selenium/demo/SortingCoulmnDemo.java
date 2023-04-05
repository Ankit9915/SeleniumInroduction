package selenium.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class SortingCoulmnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

		// to resolve the chrome version error
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeoption);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//driver.findElement(By.xpath("//tr/th[1]")).click();
	List<WebElement> li= driver.findElements(By.xpath("//tr/td[1]"));
	ArrayList<String> originalList=new ArrayList<>();
	for(int i=0;i<li.size();i++) {
		originalList.add(li.get(i).getText());
		
		}
	
	System.out.println("++++++++++++++++++++++++++++++");
	ArrayList<String> copiedList=new ArrayList<>();
	for(int i=0;i<originalList.size();i++) {
		copiedList.add(originalList.get(i));
	}
	
	
	Collections.sort(copiedList);
	
	for(String s:copiedList) {
		System.out.println(s);
	}
	System.out.println("++++++++++++++++++++++++++++++");
	for(String s:originalList) {
		System.out.println(s);
	}
	
	Assert.assertTrue(originalList.equals(copiedList));
	}

}

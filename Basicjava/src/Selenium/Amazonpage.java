package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
	     
		driver.findElement(By.xpath("//input[contains(@autocomplete,'name')]")).sendKeys("Minal Waman");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@autocomplete,'tel')]")).sendKeys("9552255338");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@tabindex,'4')]")).sendKeys("minalnimse65@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@autocomplete,'off')]")).sendKeys("Atul@1111");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
		
		
		
		
	}
	

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://flipkartaffiliate.freshdesk.com/support/signup");
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("9552255338");
		//driver.findElement(By.xpath("//input[contains(@class,'required text signup_text field_maxlengt')]")).sendKeys("Minal Atul Waman");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("Minal@2222");
		//driver.findElement(By.xpath("//input[contains(@class,'required email signup_email')]")).sendKeys("minalnimse11@gmail.com");
		Thread.sleep(2000);
		//driver.findElement((By.xpath(""))
		//driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary')]")).click();
		
	}

}

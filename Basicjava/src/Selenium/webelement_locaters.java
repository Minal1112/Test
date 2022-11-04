package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_locaters {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   Thread.sleep(3000);
	   driver.findElement(By.id("email")).sendKeys("minal@1112");
	   driver.findElement(By.id("pass")).sendKeys("Mminnll");
	   driver.findElement(By.tagName("button")).click();

	
	}

}

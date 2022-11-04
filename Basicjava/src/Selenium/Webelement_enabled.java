package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_enabled {//is enabled
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		
		if(login.isEnabled()) {
			System.out.println("element is enabled");
		
	}
	else {
		System.out.println("element is disabled");
	}

}}

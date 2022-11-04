package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_tab_window {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//create object of browser with referance webdriver
		driver.get("https://facebook.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.com//");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://about.facebook.com/\"");

		
		
	}}
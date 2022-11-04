package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelement_is_multiple_listbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s= new Select(Year);
		
		boolean result =s.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("Listbox is Multiselectable");
		}
		else {
			System.out.println("List is not Multiselectable");
		}
	}

}

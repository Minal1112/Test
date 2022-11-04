package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelemnt_Size_of_listbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
	WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
	//WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
	Select s= new Select(Year);
		
	List<WebElement> option = s.getOptions();
		
	int size = option.size();
	System.out.println(size);
		
		for(int i=0;i<=size-1;i++) {
			System.out.println(option.get(i).getText());
		}
		
		
		
	}

}

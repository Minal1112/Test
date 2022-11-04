package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webelement_listbox_find_method {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s= new Select(Month);
		//s.selectByIndex(11);  //this are the three method of handle to find list index
		//s.selectByVisibleText("Dec");
		s.selectByValue("12");
	}

}

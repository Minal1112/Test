package Pop_Up;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Child_browser {
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://skpatro.github.io/demo/links/ ");	
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();// main page element action perform
	
			Set<String> id = driver.getWindowHandles();
			
			ArrayList<String>  A1 = new ArrayList<String>(id);
			String CWID = A1.get(1);
			
			driver.switchTo().window(CWID);
			driver.findElement(By.xpath("//span[text()='Training']")).click();
			Thread.sleep(2000);
			driver.switchTo().window(A1.get(0));
			
			driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
	         
	
	
	
	
	}}

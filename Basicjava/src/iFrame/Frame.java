package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	  //iframe URL
	  //Thread.sleep(2000);
	  driver.switchTo().frame("iframeResult");//iframe attribute value to check iframe
	  driver.findElement(By.xpath("//button[@type='button']")).click();//givr xpath of iframe 
	  driver.switchTo().parentFrame();//it goes to main page of frame
	  
	  driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	  
	}
	

}//driver.switchTo().defaultContent();  we use this method when there are multiple iframe present 
                                        //iframe in iframe then we use defaultcontent method

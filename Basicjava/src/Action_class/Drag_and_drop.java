package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement distination = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		Actions action =new Actions(driver);
		Thread.sleep(2000);
		//action.moveToElement(source).clickAndHold().moveToElement(distination).release().build().perform();
	    action.dragAndDrop(source, distination).build().perform();
		
	}

}

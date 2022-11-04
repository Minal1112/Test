
package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_getTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		driver.get("https://web.whatsapp.com");
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		String title = driver.getTitle();
		System.out.println(title);
		String expectedtitle = "Whatsapp";
		
		if(title.equalsIgnoreCase(expectedtitle)) {
			System.out.println("valid title");
			
		}
		else
			System.out.println("invalid title found");
		}
	}


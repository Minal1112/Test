package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_up_down {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/met_win_alert.asp ");
	    driver.manage().window().maximize();
		WebElement your = driver.findElement(By.xpath("//a[text()='Try it Yourself »'])[3]"));
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		     
	     // Scroll down untill elelment is not visible 
		     
	    js.executeScript("arguments[0].scrollIntoView(true)", your);
	    
	    //js.executeScript("window.scrollBy(0,-200)");// Scroll up 200 pixcels
	    your.click();
     // js.executeScript("window.scrollBy(0,1000)");// Scroll down 1000 pixcels
	 // js.executeScript("window.scrollBy(1000,0)");// Scroll right 1000 pixcels
     // js.executeScript("window.scrollBy(-1000,0)");// Scroll left 1000 pixcels
		     
		     
	}
	

	}



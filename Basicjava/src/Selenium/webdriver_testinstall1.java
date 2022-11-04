package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class webdriver_testinstall1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.amazon.in/Fire-Boltt-Industrys-Largest-Monitoring-Multiple/dp/B093H219V8?ref_=Oct_DLandingS_D_10619712_60&smid=A14CZOWI0VEHLG");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
		
		
		
		
		//Point x= new Point(400,100);//(width.height)
		//driver.manage().window().setPosition(x);
		
		
		//Dimension d = new Dimension(200,200);
		//driver.manage().window().setSize(d );
		
		 

		
		//Thread.sleep(2000);
		//driver.close();
	}

}

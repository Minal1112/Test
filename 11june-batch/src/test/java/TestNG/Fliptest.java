package TestNG;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import flipcart.Fliphome;
import flipcart.Flogin;
import flipcart.Flogout;
import utils.utility;


public class Fliptest extends utility{

	WebDriver driver;
	Flogin log1;
	Flogout lo1;
	Fliphome t;

	@BeforeClass
	public void Flipcartopen() {
		System.out.println("Before class");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
		
	}

	@BeforeMethod
	public void login1() throws InterruptedException, IOException {
		System.out.println("BeforeMethod");
		log1 = new Flogin(driver);
        log1.enterUN();
		log1.enterPWD();
		Thread.sleep(8000);
		log1.clickflip();
		 utility.screencapture(driver, 123);
		
		t = new Fliphome(driver);

	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("test");
		

//	String url = driver.getCurrentUrl();
//		 Assert.assertEquals(url, url);
//	t.Searchbox();
//	Thread.sleep(5000);
//	t.Search(driver);
//	Thread.sleep(10000);
//    t.clickiphone12(driver);
//
//	

	}

	@AfterMethod
	public void logout1() throws InterruptedException {
		System.out.println("AfterMethod");
		lo1 =new Flogout(driver);
		lo1.Account(driver);
		
	}

	@AfterClass
	public void close() {
		System.out.println("AfterClass");
		driver.close();
	}
}

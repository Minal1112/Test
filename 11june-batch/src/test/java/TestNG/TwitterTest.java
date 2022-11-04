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

import Twitter.TLogin;
import Twitter.TLogout;


public class TwitterTest {
	TLogin l;
	WebDriver driver;
	TLogout out00 ;
	
	
	@BeforeClass
	public void opentwitter() throws InterruptedException {
		System.out.println("BeforeClass");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	            driver = new ChromeDriver();
	            driver.get("https://twitter.com/");
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            driver.manage().window().maximize();
	       }
	@BeforeMethod
	public void log1() throws InterruptedException, IOException {
		System.out.println("BeforeMethod");
	     l = new TLogin(driver);
	     l.in();
	     Thread.sleep(1000);
		 l.Tuser();
		 Thread.sleep(1000);
		 l.Tnext();
		 Thread.sleep(1000);
		 l.Tpass();
		 Thread.sleep(10000);
		 l.Topen();

		 
		
} 
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Test");
		Thread.sleep(3000);
	}
	
	@AfterMethod
public void out1() throws InterruptedException {
	System.out.println("AfterMethod");
	Thread.sleep(3000);
	out00 =new TLogout(driver);
	Thread.sleep(3000);
	out00.Tuser();
	Thread.sleep(3000);
	out00.Tnext();
	Thread.sleep(3000);
	out00.Tbutton();
	}
	
	@AfterClass
	public void close() {
		System.out.println("AfterClass");
		//driver.close();
		
	
	}
	}
















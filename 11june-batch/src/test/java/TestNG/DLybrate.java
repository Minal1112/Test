package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LybrateDoctor.DLogin;
import LybrateDoctor.DLogout;

public class DLybrate {
	WebDriver driver;
	DLogin log;
	DLogout out0;
	
	@BeforeClass
	public void openbrowser() throws InterruptedException {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	     driver = new ChromeDriver();
	     driver.get("https://www.lybrate.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	}
	@BeforeMethod
	public void log1() {
		System.out.println("BeforeMethod");
		 log=new DLogin(driver);
		 log.Dsign();
		 log.Dphone();
		 log.DPWD();
		 log.Dsub();
		// log.Dpop();
	}
	@Test
	public void test1() {
		System.out.println("Test");
		
	}
	@AfterMethod
	public void Lout() throws InterruptedException {
		System.out.println("AfterMethod");
		  out0=new DLogout(driver);
		  out0.Account(driver);
	}	
	@AfterClass
	public void close() {
		System.out.println("AfterClass");
		driver.close();
	}
	
}

package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import BaseClass.Baseclass;
import Flip.Log;
import Flip.search;

public class test_flip extends Baseclass {
	WebDriver driver;
    Log lg;
	Flip.out out;
    search s;
    SoftAssert soft; 
@Parameters("browser")	
@BeforeTest
	public void openbrowser(String browserName) {
		System.out.println(browserName);
		
		if(browserName.equals("Chrome")) {
			driver = openChrome();
		}
        if(browserName.equals("Edge")) {
		   driver = openEdge();	
   }
      
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
}		
@BeforeClass
	public void createobjects() throws InterruptedException {
         System.out.println("Beforeclass");
		lg = new Log(driver);
		Thread.sleep(5000);
		 s = new search(driver);
		 Thread.sleep(5000);
		out = new Flip.out(driver);

	}

	@BeforeMethod
	public void EnterCre() throws InterruptedException {
		System.out.println("BeforeMethod");
		Thread.sleep(5000);
		lg.enterUN();

	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("test");

	}

	@AfterMethod
	public void out() throws InterruptedException {

		System.out.println("AfterMethod");
		Thread.sleep(5000);
		out.acc(driver);

	}

	@AfterClass
	public void close() {
		driver.close();
	}

}



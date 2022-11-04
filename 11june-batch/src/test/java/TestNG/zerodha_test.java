package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import flipcart.F_login;
import flipcart.logout_page;
import zerodha.Home_page;
import zerodha.pin_page;

public class zerodha_test {
	WebDriver driver;
	F_login log ;
	Home_page Home;
	logout_page Logout;
	pin_page Pin;
@BeforeClass
public void OpenBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver =new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("https://kite.zerodha.com/");
	 
	 }
@BeforeMethod
public void applicationopen() throws InterruptedException {
	 log = new F_login(driver);
	 log.enterUser(driver);
	 Thread.sleep(1000);
	 log.pass(driver);
	 Thread.sleep(1000);
	 
	 
	 
	 Pin =new pin_page (driver);
	 Thread.sleep(10000);
	 Pin.enterPin();
	 
	 Pin.Continue();
	 Thread.sleep(6000);
	 
	 Home =new Home_page(driver);
	 
	 Logout =new logout_page(driver);
	 
	}


@Test(priority=1)
public void test1() throws InterruptedException {
	System.out.println("Test1");
	Home.order();
	Thread.sleep(6000);
	}
@Test(priority=2)
public void test2() throws InterruptedException {
	System.out.println("Test2");
	Home.holding();
	Thread.sleep(6000);
}
@Test(priority=3)
public void test3() throws InterruptedException {
  System.out.println("Test3");
Home.position();
Thread.sleep(6000);
}
@Test(priority=4)
public void test4() throws InterruptedException {
	System.out.println("Test4");
	Home.Funds();
	Thread.sleep(6000);
}
@Test(priority=5)
public void test5() throws InterruptedException {
	System.out.println("Test5");
	Home.Apps();
	Thread.sleep(6000);
}
@AfterMethod
public void Logout() {
	Logout.user();
	Logout.logout();
	Home.changeuser();
	
}
@AfterClass
public void Close() {
	driver.close();
}

}





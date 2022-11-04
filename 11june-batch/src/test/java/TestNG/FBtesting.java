package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebook.FBHome;
import facebook.FBLogin;
import facebook.FBLogout;

public class FBtesting {
	WebDriver driver;
	FBLogin Log ;
	FBHome Home;
	FBLogout lo;
	
@BeforeClass

public void OpenBrowser() {
	System.out.println("BeforeClass");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	 }
@BeforeMethod
public void applicationopen() throws InterruptedException {
	System.out.println("BeforeMethod");
	 Log = new FBLogin();
	 Thread.sleep(2000);
	 Log.FBun();
	 Thread.sleep(2000);
	 Log.FBPass();
	 Thread.sleep(2000);
	 Log.FBopen();
	
	 Home =new FBHome(driver);
}
@Test
public void tests() {
	System.out.println("Tests");
	
}
@AfterMethod
public void Logout() {
	System.out.println("AfterMethod");
	 lo =new FBLogout(driver);
	
}
@AfterClass
public void close() {
	System.out.println("AfterClass");
	driver.close();
}
}





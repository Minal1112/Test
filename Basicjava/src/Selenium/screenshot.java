package Selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot {
	


	
public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	
WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486453138860&hvpos=&hvnetw=g&hvrand=7455356592225396368&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062085&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=CjwKCAjwsfuYBhAZEiwA5a6CDK07qApiItHny-z-jNpeI7Jn8yHq_Pl9TQj4CfdUa1cGQT9DUna3qxoCiLIQAvD_BwE");
driver.manage().window().maximize();
Thread.sleep(2000);
for (int s=0;s<=5;s++) {
File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String text  =RandomString.make();
File dest =new File("E:\\Screenshots\\Test"+text+".jpg");
FileHandler.copy(src, dest);
			
}}

}




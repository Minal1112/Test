package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_isdisplayed {
	public static void main1(String[] args) throws InterruptedException {
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfacebook%20create%20account%7C&placement=&creative=589460569870&keyword=facebook%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-12091220328%26loc_physical_ms%3D9062095%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIpc-67J-C-gIVTNlMAh1JxQvPEAAYASAAEgKTZ_D_BwE");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
	Thread.sleep(2000);
	WebElement result = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	
	boolean display = result.isDisplayed();
	System.out.println(display);
	}

}

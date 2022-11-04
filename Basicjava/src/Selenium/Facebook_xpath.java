package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_xpath{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569867%7Cb%7Cfacebook%20create%20new%20account%7C&placement=&creative=589460569867&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-298831213137%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMItcSQwsf2-QIVx2OLCh3FUwv6EAAYASAAEgJF7PD_BwE");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Minalnimse");//xpath by using attribute
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aaaaaaa");//xpath by using attribute
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();//xpath by using text
		//driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();//xpath by contains by using attribute
		
		//driver.findElement(By.xpath("//a[@rel='async']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Minal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nimse");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("9552255338");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("Minal@1994");
		driver.findElement(By.xpath("//label[contains(@class,'_58mt')][1]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[contains(@aria-label,'Day')]")).sendKeys("11");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[contains(@aria-label,'Month')]")).sendKeys("Dec");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//select[contains(@title,'Year')]")).sendKeys("1998");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
	    Thread.sleep(2000);
	
	
	}}




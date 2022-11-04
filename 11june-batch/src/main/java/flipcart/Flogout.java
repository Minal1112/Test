package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flogout {
	WebDriver driver;
	@FindBy(xpath="//div[text()='My Account']")
	private WebElement account;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public Flogout(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void Account(WebDriver driver) throws InterruptedException {
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(account).build().perform();
	    Thread.sleep(2000);
	    a.moveToElement(logout).click().build().perform();
	}


}

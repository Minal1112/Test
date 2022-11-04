package LybrateDoctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DLogout {
	WebDriver driver;
	@FindBy(xpath="//dropdown[@class='ly-logged-in-control ']")
	private WebElement account1;
	@FindBy(xpath="")
	private WebElement logout1;
	
	public DLogout(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void Account(WebDriver driver) throws InterruptedException {
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(account1).build().perform();
	    Thread.sleep(2000);
	    a.moveToElement(logout1).click().build().perform();
	}
}


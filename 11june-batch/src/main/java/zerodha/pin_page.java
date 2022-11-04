package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pin_page {
	@FindBy (xpath="//input[@label='PIN']")
	private  WebElement pin;
	@FindBy(xpath="//button[@class='button-orange wide']")
	private WebElement Continue;
	
	public pin_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void enterPin() {
		pin.sendKeys("234567");
	}
	public void Continue() {
		Continue.click();
	}}



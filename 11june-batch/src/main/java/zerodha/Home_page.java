package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy(xpath="//span[text()='Orders']")
	private WebElement order;
	@FindBy(xpath="//span[text()='Holdings']")
	private WebElement holding;
	@FindBy(xpath="//span[text()='Positions']")
	private WebElement position;
	@FindBy(xpath="//span[text()='Funds']")
	private WebElement Funds;
	@FindBy(xpath="//span[text()='Apps']")
	private WebElement Apps;
	@FindBy(xpath="//a[text()='Change user']")
	private WebElement changeuser;
	
	
	
	
	public Home_page (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void order() {
		order.click();
	}
	public void holding() {
		holding.click();
	}
	
	public void position() {
		position.click();
}
	public void Funds() {
		Funds.click();
}
	public void Apps() {
		Apps.click();
	}
	public void changeuser() {
		changeuser.click();
	}}




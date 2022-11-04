package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout_page {
	@FindBy(xpath="//span[@class='user-id']")
	private WebElement user;
	@FindBy (xpath="//a[@target='_self']")
	private WebElement logout;


public logout_page (WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void user() {
	user.click();
}
public void logout() {
	logout.click();
}
}



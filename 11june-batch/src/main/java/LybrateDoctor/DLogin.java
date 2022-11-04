package LybrateDoctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DLogin {
	@FindBy(xpath="//a[text()='Login/Sign-up']")
	private WebElement login0;
	
	@FindBy(xpath="//input[@placeholder='Phone*']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
//	@FindBy(xpath="//button[text()='✕']")
//	private WebElement popup;

public  DLogin(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public void Dsign() {
	login0.click();
	
}
public void Dphone(){
	Phone.sendKeys("9673860996");
}
public void DPWD() {
	pwd.sendKeys("Amol@0996");
	
}
public void Dsub() {
	submit.click();
}
//public void Dpop() {
//	popup.click();
//}
}






package Twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLogin {
	
	@FindBy(xpath="(//div[@dir='auto'])[8]")
	private WebElement signin;
	@FindBy(xpath="//input[@spellcheck='true']")
	private WebElement id;
	@FindBy(xpath="//div[@role='button'][2]")
	private WebElement next;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath="(//div[@role='button'])[3]")
	private WebElement tlogin;
	
	public TLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void in() {
		signin.click();
	}
	public void Tuser() {
		id.sendKeys("9673860996");
	}
	public void Tnext() {
		next.click();
	}
	public void Tpass() {
		pass.sendKeys("Amol@0996");
	}
	public void Topen() {
		tlogin.click();
	}
}


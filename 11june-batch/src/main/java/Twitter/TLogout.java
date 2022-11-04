package Twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLogout {
	@FindBy(xpath="//div[@aria-label='Account menu']")
	private WebElement Alog;
	@FindBy(xpath="//a[@href='/logout']")
	private WebElement logout;
	@FindBy(xpath="(//div[@role='button'])[1]")
	private WebElement button;
	
	
	public TLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
		public void Tuser() {
			Alog.click();
		}
		public void Tnext() {
			logout.click();
			}
		public void Tbutton() {
			button.click();
		}
		
}

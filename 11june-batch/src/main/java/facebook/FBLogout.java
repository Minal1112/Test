package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogout {
	// Step 1 To Data Member should declare the globally with PRIVATE 
		@FindBy(xpath="//input[@type='text']")
		private WebElement username;
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		@FindBy(xpath="//button[@value='1']")
		private WebElement Login;
		// Step 2 Initialization all constructor with PUBLIC access specifier
		
		public FBLogout(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		// Step 3 Method create
			public void enterUN() {
				username.sendKeys("9767356736");
			}
			public void	 enterPass() {
				password.sendKeys("hhhh");
			}
			public void enterlogin() {
				Login.click();
			}
	}
		



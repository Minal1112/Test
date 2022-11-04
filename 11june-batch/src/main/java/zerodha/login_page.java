package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	// Step 1 To Data Member should declare the globally with PRIVATE 
		@FindBy(xpath="//input[@type='text']")
		private WebElement username;
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement login;
		// Step 2 Initialization all constructor with PUBLIC access specifier
		
		public login_page (WebDriver driver) {
			PageFactory.initElements(driver, this);
			}
		// Step 3 Method create
		public void enterUN() {
			username.sendKeys("OKP335");
		}
		public void	 pass() {
			password.sendKeys("ZAQ1234567");
		}
		public void Login() {
			login.click();
		}
		}



package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin {
	////input[@name='email']
	//input[@placeholder='Email address or phone number']
	// Step 1 To Data Member should declare the globally with PRIVATE 
		@FindBy(xpath="//input[@type='text']")
		private WebElement phone;
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		@FindBy(xpath="//button[@name='login']")
		private WebElement login;
		// Step 2 Initialization all constructor with PUBLIC access specifier
		
		public void Login_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		// Step 3 Method create
			public void FBun() {
				phone.sendKeys("9767356736");
			}
			public void	 FBPass() {
				password.sendKeys("atul.raje");
			}
			public void FBopen() {
				login.click();
			}
	}
		



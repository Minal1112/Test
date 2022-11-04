package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHome {
	@FindBy(xpath="")
	private WebElement home;
	@FindBy(xpath="")
	private WebElement watch;
	@FindBy(xpath="")
	private WebElement friends;
	@FindBy(xpath="")
	private WebElement search;
	
	// Step 2 Initialization all constructor with PUBLIC access specifier
	
		public FBHome(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		// Step 3 Method create
		public void home() {
			
		}
		public void watch() {
			
		}
		
		public void friends() {
			
	}
		public void search() {
			
	}
		public void Apps() {
			
		
}
}



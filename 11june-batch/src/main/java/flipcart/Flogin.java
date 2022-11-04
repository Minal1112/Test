package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flogin {
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement un;
	@FindBy(xpath="(//input[@type='password'])")
	private WebElement pass;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement click;

	
	public Flogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUN() {
		un.sendKeys("7020765028");
		}
	public void enterPWD(){
		pass.sendKeys("@Saarth1017");
	    }
	public void clickflip() {
		click.click();
		
		
	}

}




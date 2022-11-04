package Flip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log {
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement un;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	private WebElement li;

	public Log(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUN() throws InterruptedException {
		un.sendKeys("7020765028");
		Thread.sleep(2000);
		pwd.sendKeys("@Saarth1017");
		Thread.sleep(2000);
		li.click();
	}
}



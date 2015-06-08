package swnTestGroup_0.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class LoginPage extends Page{
	
	public LoginPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(xpath = "//input[@id='promed-login']")
	private WebElement loginField;
	
	@FindBy(xpath = "//input[@id='promed-password']")
	private WebElement passField;
	
	@FindBy(xpath = "//button[@id='auth_submit']")
	private WebElement authButton;
	
	public LoginPage setLoginField(String text) {
		loginField.sendKeys(text);
		return this;
	}
	
	public LoginPage setPassField(String text) {
		passField.sendKeys(text);
		return this;
	}
	
	public void clickAuthButton(){
		authButton.click();
	}
	
	public LoginPage ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//button[@id='auth_submit']")));
		return this;
	}	
}

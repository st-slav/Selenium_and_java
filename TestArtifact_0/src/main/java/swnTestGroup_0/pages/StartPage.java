package swnTestGroup_0.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class StartPage extends Page {
	
	public StartPage(PageManager pages) {
		super(pages);
	}
	
	@FindBy(xpath = "//div[@class='title']/a[@href='?c=portal&m=promed']")
	private WebElement promedLink;
	
	public LoginPage clickPromedLink(){
		promedLink.click();
		return pages.loginPage;
	}
	
	public StartPage ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//div[@class='title']/a[@href='?c=portal&m=promed']")));
		return this;
	}
}

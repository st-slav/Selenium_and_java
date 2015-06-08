package swnTestGroup_0.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuClassic extends Page {
	
	public TopMenuClassic(PageManager pages) {
		super(pages);
	}
	
	public TopMenuClassic ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//span[contains(text(), 'Сервис')]")));
		return this;
	}	

}

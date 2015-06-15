package swnTestGroup_0.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectionDefaultARMForm extends Page {
	
	public SelectionDefaultARMForm (PageManager pages){
		super (pages);
	}
	
	public SelectionDefaultARMForm ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.cssSelector("//div[@id = 'swSelectWorkPlaceWindow']")));
		return this;
	}
}

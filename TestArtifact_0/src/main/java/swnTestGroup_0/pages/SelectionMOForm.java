package swnTestGroup_0.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SelectionMOForm extends Page {
	
	public SelectionMOForm (PageManager pages){
		super (pages);
	}
	
	@FindBy(xpath = "//span[text() = 'Âûבמנ ÌÎ']")
	private WebElement nameSelectionMOForm;
	
	public SelectionMOForm ensurePageLoaded(){
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//span[text() = 'Âûבמנ ÌÎ']")));
		return this;
	}

}

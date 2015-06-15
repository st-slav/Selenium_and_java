package swnTestGroup_0.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

//import swnTestGroup_0.pages.DisplayedElementLocatorFactory;
//import swnTestGroup_0.pages.Page;

// ���������� ����������
// ������������� �������

public class PageManager {
	
	private WebDriver driver;
	
	public StartPage startPage;
	public LoginPage loginPage;
	public TopMenuClassic topMenuClassic;
	public SelectionMOForm selectionMOForm;
	public SelectionDefaultARMForm selectionDefaultARMForm; 
	
	public PageManager(WebDriver driver){
		this.driver = driver;
		startPage = initElements(new StartPage(this));
		loginPage = initElements(new LoginPage(this));
		topMenuClassic = initElements(new TopMenuClassic(this));
		selectionMOForm = initElements(new SelectionMOForm(this));
		selectionDefaultARMForm = initElements(new SelectionDefaultARMForm(this));
		
	}
	
	//������������� ������� �������� (���������� ������� � ���������)
	  private <T extends Page> T initElements(T page) {
		    //PageFactory.initElements(driver, page); //����� �������������� � �������������� ������� ��������
		    //PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), page);//����� ��������
		    PageFactory.initElements(new DisplayedElementLocatorFactory(driver, 10), page);//����� �������� (���� ������� ���� �������)
		    return page;
		  }
	
	public WebDriver getWebDriver() {
		return driver;
	}
}

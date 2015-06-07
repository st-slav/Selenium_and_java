package swnTestGroup_0.applogic1;

// ����� �����, ���������� ��������
// ���� ����� �������� �����-�� ���� ���, ��������:
// �������� � ������������� ���������� ��������
// ��������������� ����� ������ ������� ��� � ���������, �� ������ �������� ����� (���� isElemrntPresent)
// ����� ����� ��� ���� �������� ������� �������� � ���������

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import swnTestGroup_0.pages.PageManager;

public class DriverBasedHelper {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected PageManager pages;
	
	public DriverBasedHelper(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		pages = new PageManager(driver);
	}
}

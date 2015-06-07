package swnTestGroup_0.applogic1;

// общий класс, расширение хелперов
// сюда можно помещать какой-то ощий код, например:
// создание и инициализацию механизмов ожиданий
// вспомогательные общие методы которых нет в селениуме, но сильно упростят жизнь (типа isElemrntPresent)
// общее место для всех хелперов которые работают с драйвером

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

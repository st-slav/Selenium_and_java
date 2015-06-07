package swnTestGroup_0.applogic1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import swnTestGroup_0.applogic.ApplicationManager;
import swnTestGroup_0.applogic.BaseHelper;
import swnTestGroup_0.util.Browser;
import swnTestGroup_0.util.PropertyLoader;
import swnTestGroup_0.webdriver.WebDriverFactory;

public class ApplicationManager1 implements ApplicationManager {

	private BaseHelper baseHelper;
	
	private String baseUrl;		
	private WebDriver driver;
	
	public ApplicationManager1() {
		
		baseUrl = PropertyLoader.loadProperty("site.url");
		String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		Browser browser = new Browser();
		browser.setName(PropertyLoader.loadProperty("browser.name"));
		browser.setVersion(PropertyLoader.loadProperty("browser.version"));
		browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

		String username = PropertyLoader.loadProperty("user.username");
		String password = PropertyLoader.loadProperty("user.password");
		
		driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //неявные ожидания
		
		//app = new ApplicationManager0();
		
		baseHelper = new BaseHelper1(this); //this чтоб хелперы могли общаться через менеджера
		
	}
	
	@Override
	public BaseHelper getBaseHelper(){
		return baseHelper;
	}
	
	protected WebDriver getWebDriver(){
		return driver;
	}
	
	@Override
	public void stop() {
	  if (driver != null) {
	    driver.quit();
	    }
	}
}

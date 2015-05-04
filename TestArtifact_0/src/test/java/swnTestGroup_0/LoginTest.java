package swnTestGroup_0;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest extends swnTestGroup_0.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testUntitled() throws Exception {

    driver.get(baseUrl /*+ "/?c=portal"*/);
    driver.findElement(By.linkText("Промед")).click();
    driver.findElement(By.id("promed-login")).clear();
    driver.findElement(By.id("promed-login")).sendKeys("Admin");
    driver.findElement(By.id("promed-password")).clear();
    driver.findElement(By.id("promed-password")).sendKeys("AmoKK");
    driver.findElement(By.id("auth_submit")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
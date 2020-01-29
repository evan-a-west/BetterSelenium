package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPOM {
  private WebDriver driver;

  public AbstractPOM (WebDriver driver) {
    this.driver = driver;
  }

  public String getPageTitle() {
    return driver.getTitle();
}

  public String getElementText(By element) {
    return driver.findElement(element).getText();
  }
}

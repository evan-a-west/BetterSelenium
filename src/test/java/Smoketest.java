import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.HomePage;

public class Smoketest {
  private Selenium seleniumOperations;
  private WebDriver webDriver;

  private HomePage homePage;

  @BeforeTest
  public void loadHome() {
    seleniumOperations = new Selenium("https://better.com/");
    webDriver = seleniumOperations.InitialzeWebdriver();
    homePage = new HomePage(webDriver);
  }

  @Test
  public void verifyHomepageTitle() {
    String expectedTitle = "Simple, Online Mortgage - Better Mortgage";
    String actualTitle = homePage.getPageTitle();

    Assert.assertEquals(expectedTitle, actualTitle);
  }


}

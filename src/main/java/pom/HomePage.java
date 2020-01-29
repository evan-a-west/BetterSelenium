package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPOM{
  private By logo = By.className("_26JR3");
  private By aboutUsButton = By.xpath("//*/a[@class='_2Cj_5'][@href='/about-us']");
  private By viewRatesButton = By.xpath("//*/a[@class='_2Cj_5'][@id='view-rates-link']");
  private By purchasesButton = By.xpath("//*/a[@class='_36lwI'][@href='/mortgage-rates/purchase']");
  private By refinanceButton = By.xpath("//*/a[@class='_36lwI'][@href='/mortgage-rates/refinance']");
  private By resourcesButton = By.xpath("//*/a[@class='_2Cj_5'][@href='/content']");
  private By faqButton = By.xpath("//*/a[@class='_2Cj_5'][@href='/faq']");
  private By forAgentsButton =  By.xpath("//*/a[@class='_2Cj_5'][@href='/with/foragents']");
  private By signInButton = By.className("pPWJI");
  private By getStartedButton1 = By.xpath("//*/a[@class='FqF_x IzvYM _1LKXN'][@data-qa='journey-get-started']");
  private By getStartedButton2 =  By.xpath("(//*/a[@class='FqF_x IzvYM _1LKXN'][@data-qa='main-nav-cta'])[2]");
  private By getGetStartedButton3 = By.xpath("//*/a[@class='FqF_x IzvYM _1LKXN'][not(@data-qa)]");

  public HomePage(WebDriver driver) {
    super(driver);
  }

  public String getLogoText() {
    return getElementText(logo);
  }

  public String getAboutUsButtonText() {
    return getElementText(aboutUsButton);
  }

  public String getViewRatesButtonText() {
    return getElementText(viewRatesButton);
  }

  public String getPurchasesButtonText() {
    return getElementText(purchasesButton);
  }

  public String getRefinanceButtonText() {
    return getElementText(refinanceButton);
  }

  public String getResourcesButtonText() {
    return getElementText(resourcesButton);
  }

  public String getFaqButtonText() {
    return getElementText(faqButton);
  }

  public String getForAgentsButtonText() {
    return getElementText(forAgentsButton);
  }

  public String getSignInButtonText() {
    return getElementText(signInButton);
  }

  public String getGetStartedButton1Text() {
    return getElementText(getStartedButton1);
  }

  public String getGetStartedButton2Text() {
    return getElementText(getStartedButton2);
  }

  public String getGetGetStartedButton3Text() {
    return getElementText(getGetStartedButton3);
  }

}

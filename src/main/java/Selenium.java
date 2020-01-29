import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
  private String home_url;

  public Selenium(String home_url) {
    this.home_url = home_url;
  }

  public WebDriver InitialzeWebdriver() {
    System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");

    WebDriver chromedriver = new ChromeDriver();
    chromedriver.get(home_url);
//    chromedriver.manage().window().fullscreen();
    return chromedriver;
  }
}

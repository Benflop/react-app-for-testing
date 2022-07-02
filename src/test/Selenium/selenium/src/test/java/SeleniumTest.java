import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  @Test
  public void chromeSession() {
    // System.setProperty("webdriver.chrome.whitelistedIps", "");

    // ChromeOptions options = new ChromeOptions();
    // options.addArguments("--no-sandbox");
    // options.addArguments("--headless");
    // options.addArguments("--disable-dev-shm-usage");

    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--headless");

    // WebDriverManager.chromedriver().setup();
    FirefoxDriver driver = new FirefoxDriver(options);

    // Launch Website
    driver.navigate().to("http://www.google.com/");

    String expectedTitle = "Google";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, expectedTitle);

    driver.quit();
  }
}
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  @Test
  public void chromeSession() {

    System.setProperty("webdriver.chrome.whitelistedIps", "");

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--no-sandbox");
    options.addArguments("--headless");
    options.addArguments("--disable-dev-shm-usage");

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver(options);

    // Launch Website
    driver.navigate().to("http://www.google.com/");

    String expectedTitle = "Google";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, expectedTitle);

    driver.quit();
  }
}
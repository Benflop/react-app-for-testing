import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  @Test
  public void chromeSession() {
    // System.setProperty("webdriver.chrome.driver", "chromedriver");
    // WebDriver driver = new ChromeDriver();

    WebDriverManager.chromedriver().setup();

    ChromeOptions options = new ChromeOptions().setHeadless(true);
    ChromeDriver driver = new ChromeDriver(options);

    // Launch Website
    driver.navigate().to("http://www.google.com/");

    String expectedTitle = "Google";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, expectedTitle);

    driver.quit();
  }
}

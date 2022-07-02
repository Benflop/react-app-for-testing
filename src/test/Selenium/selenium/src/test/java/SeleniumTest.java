import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  @Test
  public void firefoxSession() {
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--headless");

    // WebDriverManager.chromedriver().setup();
    FirefoxDriver driver = new FirefoxDriver(options);

    // Launch Website
    driver.navigate().to("http://www.google.com/");

    String expectedTitle = "Google";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, "Tester");
    System.out.println("Assertion Successful");

    driver.quit();
  }
}
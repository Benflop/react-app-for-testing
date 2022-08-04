import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  @Test
  public void firefoxSession() {
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("--headless");

    FirefoxDriver driver = new FirefoxDriver(options);

    // Launch Website
    driver.navigate().to("http://localhost:3000/");

    String expectedTitle = "React App";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, expectedTitle);
    System.out.println("Assertion Successful - Open React App");

    // Driver Quit
    driver.quit();
  }
}
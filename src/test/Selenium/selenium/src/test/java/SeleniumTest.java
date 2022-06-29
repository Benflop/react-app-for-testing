import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  @Test
  public void chromeSession() {
    // System.setProperty("webdriver.chrome.driver", "chromedriver");
    // WebDriver driver = new ChromeDriver();

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();

    // Launch Website
    driver.navigate().to("http://www.google.com/");

    String expectedTitle = "Google";
    String originalTitle = driver.getTitle();
    Assert.assertEquals(originalTitle, expectedTitle);

    driver.quit();
  }
}

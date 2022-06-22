import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  @Test
  public void chromeSession() {
    System.setProperty("webdriver.chrome.driver", "../../chromedriver");

    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();

    // Launch Website
    driver.navigate().to("http://www.google.com/");

    driver.quit();
  }
}

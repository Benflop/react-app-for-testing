import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SeleniumTest {

  public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();

    driver.get("https://selenium.dev");

    driver.quit();
}

  // @Test
  // public void chromeSession() {
  //   System.setProperty("webdriver.chrome.driver", "chromedriver");

  //   WebDriver driver = new ChromeDriver();

  //   // Launch Website
  //   driver.navigate().to("http://www.google.com/");

  //   String expectedTitle = "Google";
  //   String originalTitle = driver.getTitle();
  //   Assert.assertEquals(originalTitle, expectedTitle);

  //   driver.quit();
  // }
}

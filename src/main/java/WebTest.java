import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class WebTest extends AbstractWebTest {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        System.out.println("beforeMethod.............................");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod.............................");

    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass.............................");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass.............................");
    }

    @BeforeTest
    public void beforeTest() {

        System.out.println("beforeTest.............................");
    }

    @AfterTest
    public void afterTest() {

        System.out.println("afterTest.............................");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        System.out.println("beforeSuite.............................");
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();

        System.out.println("afterSuite.............................");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("beforeGroups.............................");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("afterGroups.............................");
    }

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 extends WebTest {

    @Test
    public void testTest1(){
        System.setProperty("webdriver.chrome.driver", "/src/main/java/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("www.chrome.com.ua");
        driver.quit();
    }
}

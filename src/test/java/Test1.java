import org.testng.annotations.Test;

public class Test1 extends WebTest {

    @Test
    public void testTest1() throws InterruptedException {
        driver.get("https://www.google.com.ua");
        Thread.sleep(5000);
    }
}

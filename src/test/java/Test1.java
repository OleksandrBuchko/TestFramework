import org.testng.annotations.Test;

public class Test1 extends WebTest {

    @Test
    public void testTest1() throws InterruptedException {
        //driver.get("https://www.google.com.ua");
        System.err.println("Test1");
        System.out.println(Thread.currentThread().getId());
        Thread.sleep(5000);
    }
}

import org.testng.annotations.Test;

public class Test4 extends WebTest {

    @Test
    public void testTest4() throws InterruptedException {
        //driver.get("https://www.google.com.ua");
        System.err.println("Test4");
        System.out.println(Thread.currentThread().getId());
        Thread.sleep(5000);

    }

}

import org.testng.annotations.Test;

public class Test3 extends WebTest {

    @Test
    public void testTest3() throws InterruptedException {
        //driver.get("khjk/www.google.com.ua");
        System.err.println("Test3");
        System.out.println(Thread.currentThread().getId());
        Thread.sleep(5000);

    }

}

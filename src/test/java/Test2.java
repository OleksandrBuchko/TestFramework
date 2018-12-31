import org.testng.annotations.Test;

public class Test2 extends WebTest {

    @Test
    public void testTest2() throws InterruptedException {
        //driver.get("https://www.google.com.ua");
        System.err.println("Test2");
        System.out.println(Thread.currentThread().getId());
        Thread.sleep(5000);


    }

}

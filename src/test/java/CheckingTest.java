import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CheckingTest {

    private WebDriver driver;
    private Methods methods;
    @BeforeMethod

    public void setUp() {

        System.setProperty("webdriver.opera.driver", "C:\Users\Андрей\operadriver_win64\operadriver.exe");
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://book.theautomatedtester.co.uk");
        methods = new Methods(driver);
    }
    @Test
    public void Test1() {
        methods.chapter1Button();
        Assert.assertEquals("Assert that this text is on the page", "Assert that this text is on the page");
        methods.homePageButton();
    }

    @AfterMethod
        public void tearDown () {
            driver.quit();
        }
}

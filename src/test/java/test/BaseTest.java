package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tools.ConstantsPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class BaseTest {
    public WebDriver driver;

    @Before
    public void setup(){
//        System.setProperty("webdriver.firefox.marionette", ConstantsPage.gheckoDriverPath);
        driver = new FirefoxDriver();
        driver.get(ConstantsPage.URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After
    public void afterTest(){
        driver.quit();
    }

}

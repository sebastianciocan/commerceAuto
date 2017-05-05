package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sebastianciocan on 5/5/2017.
 */
public class AbstractPage {
    WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void waitForPageToLoad() {
        new WebDriverWait(driver,30).until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
    }
}

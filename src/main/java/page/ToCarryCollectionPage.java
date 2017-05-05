package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class ToCarryCollectionPage extends AbstractPage  {

    WebDriver driver;

    public ToCarryCollectionPage(WebDriver driver){
        super(driver);
    }

    public void checkIfTheCurrentPageIsTheToCarryOne(String contains){
        String url = driver.getCurrentUrl();
        Assert.assertTrue("The page is not the correct one!",url.contains(contains));
    }

}

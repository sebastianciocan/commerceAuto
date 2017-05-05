package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class ToCarryCollectionPage {

    WebDriver driver;

    public ToCarryCollectionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void checkIfTheCurrentPageIsTheToCarryOne(String contains){
        String url = driver.getCurrentUrl();
        Assert.assertTrue("The page is not the correct one!",url.contains(contains));
    }

}

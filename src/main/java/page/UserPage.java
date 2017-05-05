package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class UserPage {
    WebDriver driver;

    public UserPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "page-title")
    private WebElement headerMessageForSuccessfulLogin;

    public void checkIfTheUserWasSuccessfullyLoggedIn(){
        Assert.assertTrue("The login failed!",headerMessageForSuccessfulLogin.getText().contains("HELLO, SEBASTIANCIOCAN"));
    }

}

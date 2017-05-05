package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class HomePageContent {

    WebDriver driver;

    public HomePageContent(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".messages.status ")
    WebElement accountCreatedSuccessfullyMessage;


    public void checkIfTheAccountWasSuccessfullyCreated(){
        Assert.assertTrue("The account was not created!",accountCreatedSuccessfullyMessage.getText().contains("Registration successful. You are now logged in."));
    }
}

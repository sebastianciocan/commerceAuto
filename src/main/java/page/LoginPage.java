package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#edit-name")
    private WebElement userNameInputField;

    @FindBy(css = "#edit-pass")
    private WebElement passwordInputField;

    @FindBy(css = "#edit-submit")
    private WebElement loginButton;



    public void setUserNameInputField(String username){
        userNameInputField.sendKeys(username);
    }
    public void setPasswordInputField(String password){
        passwordInputField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }




}

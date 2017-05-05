package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class RegisteringPage {

    WebDriver driver;

    public RegisteringPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "edit-name")
    WebElement userNameInput;

    @FindBy(id = "edit-mail")
    WebElement userEmailAddressInput;

    @FindBy(id = "edit-pass-pass1")
    WebElement passwordInput;

    @FindBy(id = "edit-pass-pass2")
    WebElement confirmPasswordInput;

    @FindBy(id = "edit-submit")
    WebElement submitButton;

    public void setUserNameInput(String username){
        userNameInput.sendKeys(username);
    }
    public void setUserEmailAddressInput(String email){
        userEmailAddressInput.sendKeys(email);
    }
    public void setPasswordInput(String password){
        passwordInput.sendKeys(password);
    }
    public void setConfirmPasswordInput(String confirmPassword){
        confirmPasswordInput.sendKeys(confirmPassword);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }

}

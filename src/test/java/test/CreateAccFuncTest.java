package test;

import org.junit.Test;
import page.HeaderPage;
import page.HomePageContent;
import page.RegisteringPage;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class CreateAccFuncTest extends BaseTest {

    @Test
    public void createAnAccount(){
        HeaderPage headerPage = new HeaderPage(driver);
        RegisteringPage registeringPage = new RegisteringPage(driver);
        HomePageContent homePageContent = new HomePageContent(driver);
        headerPage.clickCreateAccountButton();
        registeringPage.setUserNameInput("test3");
        registeringPage.setUserEmailAddressInput("test3@test.comish");
        registeringPage.setPasswordInput("parola123");
        registeringPage.setConfirmPasswordInput("parola123");
        registeringPage.clickSubmitButton();
        homePageContent.checkIfTheAccountWasSuccessfullyCreated();
    }
}

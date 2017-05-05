package test;

import org.junit.Test;
import page.HeaderPage;
import page.HomePageContent;
import page.RegisteringPage;
import tools.Helpers;


/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class CreateAccFuncTest extends BaseTest {

    @Test
    public void createAnAccount(){
        Helpers helpers = new Helpers();
        HeaderPage headerPage = new HeaderPage(driver);
        RegisteringPage registeringPage = new RegisteringPage(driver);
        HomePageContent homePageContent = new HomePageContent(driver);
        headerPage.clickCreateAccountButton();
        registeringPage.setUserNameInput("test" + helpers.getCurrentTimeStamp());
        registeringPage.setUserEmailAddressInput("test" + helpers.getCurrentTimeStamp() + "@test.comish");
        registeringPage.setPasswordInput("parola123");
        registeringPage.setConfirmPasswordInput("parola123");
        registeringPage.clickSubmitButton();
        homePageContent.checkIfTheAccountWasSuccessfullyCreated();
    }
}

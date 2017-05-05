package test;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.HeaderPage;
import page.LoginPage;
import page.UserPage;
import tools.ConstantsPage;

import java.util.concurrent.TimeUnit;


public class LoginFuncTest extends BaseTest {


    @Test
     public void testLogInFunctionality(){
        HeaderPage headerPage = new HeaderPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        UserPage userPage = new UserPage(driver);
        headerPage.clickLogInHeaderButton();
        loginPage.setUserNameInputField(ConstantsPage.userName);
        loginPage.setPasswordInputField(ConstantsPage.password);
        loginPage.clickLoginButton();
        userPage.checkIfTheUserWasSuccessfullyLoggedIn();
    }
    @Test
    public void testLogoutFunctionality(){
         HeaderPage headerPage = new HeaderPage(driver);
         testLogInFunctionality();
         headerPage.clickLogOutHeaderButton();
    }


}

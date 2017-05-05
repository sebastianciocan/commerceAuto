package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderPage extends AbstractPage {

        WebDriver driver;

        public HeaderPage(WebDriver driver){
            super(driver);
        }

        @FindBy(css = "div#block-menu-menu-user-menu li[class^='first'] a")
        WebElement logInHeaderButton;
        @FindBy(css = ".last.leaf a[href='/user/logout']")
        WebElement logOutHeaderButton;
        @FindBy(css = ".last.leaf a[href='/user/register']")
        WebElement createAccountHeaderButton;



        public void clickLogInHeaderButton(){
            logInHeaderButton.click();
        }
        public void clickLogOutHeaderButton(){
            logOutHeaderButton.click();
        }
        public void clickCreateAccountButton(){
            createAccountHeaderButton.click();
        }
}

package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class MenuPage {
    WebDriver driver;

    public MenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#main-menu")
    WebElement mainMenu;

    public void selectAnItemMenu(String menuItem){
        List<WebElement> itemList = mainMenu.findElements(By.tagName("li"));

        for(WebElement element : itemList){
            if(element.findElement(By.cssSelector("a")).getText().contains(menuItem)){
                element.findElement(By.cssSelector("a")).click();
                break;
            }
            else{
                System.out.println("No menu item contained what you searched for.");
            }
        }
    }

}

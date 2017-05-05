package test;

import org.junit.Test;
import page.MenuPage;
import page.ToCarryCollectionPage;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class TestTheMenuItems extends BaseTest {

    @Test
    public void selectAnItemFromMainMenu(){
        MenuPage menuPage = new MenuPage(driver);
        ToCarryCollectionPage toCarryCollectionPage = new ToCarryCollectionPage(driver);
        menuPage.selectAnItemMenu("To Carry");
//        Use "carry" for To Carry; "drink" for To Drink With; "geek-out" for To Geek Out; "wear" for To Wear"; "products" for All Products;
        toCarryCollectionPage.checkIfTheCurrentPageIsTheToCarryOne("carry");
    }

}

package test;

import org.junit.Test;
import page.MenuPage;
import page.ToCarryCollectionPage;

/**
 * Created by sebastianciocan on 5/4/2017.
 */
public class TestTheMenuItems extends BaseTest {

    @Test
    public void selectFirstItemFromMainMenu(){
        MenuPage menuPage = new MenuPage(driver);
        ToCarryCollectionPage toCarryCollectionPage = new ToCarryCollectionPage(driver);
        menuPage.selectAnItemMenu("To Carry");
//        Use "carry" for To Carry; "drink" for To Drink With; "geek-out" for To Geek Out; "wear" for To Wear"; "products" for All Products;
        toCarryCollectionPage.checkIfTheCurrentPageIsTheToCarryOne("carry");
    }
    @Test
    public void selectSecondItemFromMainMenu(){
        MenuPage menuPage = new MenuPage(driver);
        ToCarryCollectionPage toCarryCollectionPage = new ToCarryCollectionPage(driver);
        menuPage.selectAnItemMenu("To Drink");
//        Use "carry" for To Carry; "drink" for To Drink With; "geek-out" for To Geek Out; "wear" for To Wear"; "products" for All Products;
        toCarryCollectionPage.checkIfTheCurrentPageIsTheToCarryOne("drink");
    }
    @Test
    public void selectThirdItemFromMainMenu(){
        MenuPage menuPage = new MenuPage(driver);
        ToCarryCollectionPage toCarryCollectionPage = new ToCarryCollectionPage(driver);
        menuPage.selectAnItemMenu("To Geek Out");
//        Use "carry" for To Carry; "drink" for To Drink With; "geek-out" for To Geek Out; "wear" for To Wear"; "products" for All Products;
        toCarryCollectionPage.checkIfTheCurrentPageIsTheToCarryOne("geek-out");
    }
    @Test
    public void selectFourthItemFromMainMenu(){
        MenuPage menuPage = new MenuPage(driver);
        ToCarryCollectionPage toCarryCollectionPage = new ToCarryCollectionPage(driver);
        menuPage.selectAnItemMenu("To Wear");
//        Use "carry" for To Carry; "drink" for To Drink With; "geek-out" for To Geek Out; "wear" for To Wear"; "products" for All Products;
        toCarryCollectionPage.checkIfTheCurrentPageIsTheToCarryOne("wear");
    }
    @Test
    public void selectFifthItemFromMainMenu(){
        MenuPage menuPage = new MenuPage(driver);
        ToCarryCollectionPage toCarryCollectionPage = new ToCarryCollectionPage(driver);
        menuPage.selectAnItemMenu("All Products");
//        Use "carry" for To Carry; "drink" for To Drink With; "geek-out" for To Geek Out; "wear" for To Wear"; "products" for All Products;
        toCarryCollectionPage.checkIfTheCurrentPageIsTheToCarryOne("products");
    }

}

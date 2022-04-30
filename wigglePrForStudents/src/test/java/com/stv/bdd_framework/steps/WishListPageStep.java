package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.WishListPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class WishListPageStep extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();


    @Given("^User is on Main page$")
    public void NavigationPanelIsVisible(){
        getDriver().get(START_URL);
         }

    @When("^User find “Wishlist” and push Wishlist button$")
    public void clickOnWishListButton()  {
        mainFactoryPage.clickAccept();
        mainFactoryPage.clickOnWISHlist();
    }

    @Then("^MyWishlist page displayed$")
    public void IsDisplayedWishList(){
        Assert.assertTrue(new WishListPage().isWishlistContainerDisplayed(), "Wishlist page isn't loaded properly");

    }

}


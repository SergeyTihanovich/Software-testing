package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage extends FactoryPage {
    @FindBy(className = "bem-header__list-link")
    private WebElement wishListLink;

    public boolean isWishlistContainerDisplayed(){
        return wishListLink.isDisplayed();

    }
}



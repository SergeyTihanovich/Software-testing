package com.stv.factory.factorypages;

import com.stv.factory.factorytests.BasicFactoryTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends FactoryPage {
    @FindBy(className = "bem-header__list-link")
    private WebElement wishListLink;
    private Object MainFactoryPage;

    public boolean isWishlistContainerDisplayed(){
        return wishListLink.isDisplayed();

    
    }

    public boolean isNull() {
        return MainFactoryPage == null;
    }
}



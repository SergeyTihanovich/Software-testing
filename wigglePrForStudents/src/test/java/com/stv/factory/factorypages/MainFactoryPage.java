package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

    @FindBy(id="wishlistLink")
    private WebElement wishListLink;

    @FindBy(id="truste-consent-button")
    private WebElement acceptClick;

    public boolean isAccountLinkDisplayed(){
        return accountLink.isDisplayed();
    }

    public void clickOnAccountLink(){
        accountLink.click();
    }

    public void clickOnTrustButton(){
        trustButton.click();
    }

    public WishListPage clickOnWISHlist() {
        wishListLink.click();
        return new WishListPage();
    }
    public MainFactoryPage  clickAccept() {
        acceptClick.click();
        return this;
    }


}



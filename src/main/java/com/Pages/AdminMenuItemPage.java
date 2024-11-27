package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminMenuItemPage extends PageBase {
    public AdminMenuItemPage(WebDriver driver) {
        super(driver);
    }

    private final By addBtn = By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--secondary') and contains(text(), 'Add')]");


    public boolean addBtnIsDisplayed() {
        return isDisplayed(addBtn);
    }

    public void clickAddUserBtn() {
        click(addBtn);
    }


}


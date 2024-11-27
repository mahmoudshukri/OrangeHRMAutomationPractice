package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver){
        super(driver);
    }
    private final By dashBoardLabel = By.tagName("h6");
    private final By adminMenuItem =By.linkText("Admin");





    public boolean dashBoardLabelDisplayed(){
        return
        isDisplayed(dashBoardLabel);
    }
    public boolean clickAdminMenuItemIsDisplayed(){return
                isDisplayed(adminMenuItem);
    }
    public void clickAdminMenuItem(){
        click(adminMenuItem);
    }

}

package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver){
        super(driver);
    }
    private final By dashBoardLabel = By.tagName("h6");





    public boolean dashBoardLabelDisplayed(){
        return
        isDisplayed(dashBoardLabel);
    }
}

package com.Tests;

import com.Pages.AdminMenuItemPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class createUserTests extends TestBase{
    LoginPage loginPage;
    HomePage homePage;
    AdminMenuItemPage adminMenuItemPage;
    String userName = "admin";
    String passWord = "admin123";
    @Test
    public void createUser(){
        loginPage = new LoginPage(driver);
        loginPage.login(userName,passWord);
        homePage =new HomePage(driver);
        Assert.assertTrue(homePage.clickAdminMenuItemIsDisplayed());
        homePage.clickAdminMenuItem();
        adminMenuItemPage =new AdminMenuItemPage(driver);
        Assert.assertTrue(adminMenuItemPage.addBtnIsDisplayed());
        adminMenuItemPage.clickAddUserBtn();

    }
}

package com.Tests;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    LoginPage loginPage;
    HomePage homePage;
    String userName = "admin";
    String passWord = "admin123";

    @Test
    public void userLogin (){
        loginPage = new LoginPage(driver);
        loginPage.login(userName,passWord);
        homePage =new HomePage(driver);
        Assert.assertTrue(homePage.dashBoardLabelDisplayed());

    }











}

package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver){
        super(driver);

    }
    private final By userNameTxt = By.name("username");
    private final By passWordTxt = By.name("password");
    private final By loginButton = By.cssSelector("button[type='submit']");


    public void login(String userName,String passWord){
        type(userName,userNameTxt);
        type(passWord,passWordTxt);
        click(loginButton);
    }


}

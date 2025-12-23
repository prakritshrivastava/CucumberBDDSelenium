package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By emailID=By.id("username");
    private By pass =By.id("password");

    private By signInButton=By.xpath("//button[text()='Submit']");

    private By checkTextAfterLogin=By.xpath("//h1[contains(text(),'Logged In Successfully')]");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void enterUserName(String username){
        driver.findElement(emailID).sendKeys(username);
    }

    public void enterUserPassword(String password){
        driver.findElement(pass).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(signInButton).click();
    }

}

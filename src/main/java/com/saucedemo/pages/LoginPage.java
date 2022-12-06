package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.name("user-name");

    public void emailId(String email) {
        sendTextToElement(emailField, email);
    }

    By passwordField = By.id("password");

    public void password(String password) {
        sendTextToElement(passwordField, password);
    }

    By clickedLoginButton = By.xpath("//input[@type='submit']");

    public void loginButton() {
        clickOnElement(clickedLoginButton);
    }

    By verifyTitleText = By.xpath("//span[@class='title']");

    public String verifyMessage() {
        return getTextFromElement(verifyTitleText);
    }

    By inventoryDisplayed = By.id("inventory_container");

    public void inventoryDisplay() {
        if (driver.findElement(inventoryDisplayed).isDisplayed()) {
            System.out.println("true");
        } else {
            System.out.println("no product displayed");
        }
    }
}



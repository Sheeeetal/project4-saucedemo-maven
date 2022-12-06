package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

   @Test
   public void userShouldLoginSuccessfullyWithValidCredentials(){
       //login with valid username
       loginPage.emailId("standard_user");

       //valid password
       loginPage.password("secret_sauce");

       //click on login button
       loginPage.loginButton();

       String expectedText = "PRODUCTS";
       Assert.assertEquals(loginPage.verifyMessage(),expectedText,"Login page not displayed");
   }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        //login with valid credentials
        loginPage.emailId("standard_user");

        //valid password
        loginPage.password("secret_sauce");

        // click on login button
        loginPage.loginButton();

    }
    }


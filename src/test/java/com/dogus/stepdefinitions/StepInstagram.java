package com.dogus.stepdefinitions;

import com.dogus.pages.PomInstagram;
import com.dogus.utils.ConfigurationReader;
import com.dogus.utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepInstagram {

    PomInstagram instagram = new PomInstagram();
    WebDriverWait wait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("navigate to the instagram home page")
    public void navigate_to_the_instagram_home_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("website"));

    }
    @When("Login with your credential")
    public void login_with_your_credential()  {
        instagram.usernameField.sendKeys(ConfigurationReader.getProperty("InstaUserName"));
        instagram.passwordField.sendKeys(ConfigurationReader.getProperty("InstaPassword"));
        //wait.until(ExpectedConditions.elementToBeClickable(instagram.loginBtn));


        instagram.loginBtn.click();

    }
    @When("Navigate to an account")
    public void navigate_to_an_account() {

        wait.until(ExpectedConditions.visibilityOf(instagram.logInInstaLogo));
        String url =ConfigurationReader.getProperty("website")+ConfigurationReader.getProperty("LikedAccount");

        Driver.getDriver().get(url);




    }
    @Then("Like the all post in that account")
    public void like_the_all_post_in_that_account() {
        wait.until(ExpectedConditions.visibilityOf(instagram.firstPost));
        instagram.gonderiler.click();
        String numberOfPosts= instagram.numberOfPost.getText();
        int number= Integer.valueOf(numberOfPosts);
        instagram.firstPost.click();
        while(number>0){

            wait.until(ExpectedConditions.visibilityOf(instagram.likeBtn));
            instagram.likeBtn.click();
            instagram.wholePage.sendKeys(Keys.ARROW_RIGHT);
            number--;
        }

    }




}

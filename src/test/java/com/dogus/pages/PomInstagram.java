package com.dogus.pages;

import com.dogus.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomInstagram {
    public PomInstagram(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = "input[name='username']")
    public WebElement usernameField;

    @FindBy(css = "input[name='password']")
    public WebElement passwordField;

    @FindBy(css = "button[class='_acan _acap _acas _aj1-']")
    public WebElement loginBtn;

    @FindBy(css = "svg[aria-label='Instagram']")
    public WebElement logInInstaLogo;

    @FindBy(xpath = "(//span[@class='_ac2a'])[1]")
    public WebElement numberOfPost;

    @FindBy(xpath = "(//div[@class='_aagw'])[1]")
    public WebElement firstPost;

    @FindBy(xpath = "//span[@class='_aamw']")
    public WebElement likeBtn;

    @FindBy(css = "html[class='_9dls js-focus-visible _aa4c']")
    public WebElement wholePage;

    @FindBy(xpath = "//span[.='Gönderiler']")
    public WebElement gonderiler;


}

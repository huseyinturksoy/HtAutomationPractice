package com.dogus.pages;

import com.dogus.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomDogus {

    public pomDogus(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}

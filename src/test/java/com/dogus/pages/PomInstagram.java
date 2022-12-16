package com.dogus.pages;

import com.dogus.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class PomInstagram {
    public PomInstagram(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


}

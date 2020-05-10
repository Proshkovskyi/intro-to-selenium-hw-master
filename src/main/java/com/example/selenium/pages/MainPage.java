package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends com.example.selenium.pages.BasePage {

    @FindBy(how = How.CSS, using = "h2")
    private WebElement title;

    @FindBy(how = How.CSS, using = ".icon-2x")
    private WebElement logout;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText();
    }

    public MainPage clickLogout() {
        logout.click();
        return this;
    }
}

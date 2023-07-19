package com.kraftech.pages;

import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[.='Dashboard']/../../../li")
    public List<WebElement> menuList;
    @FindBy(css = ".d-none.d-md-block.dropdown-toggle.ps-2")
    public WebElement userAccountName;
    @FindBy(xpath = "//span[.='Developers']")
    public WebElement developersMenu;
    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardMenu;


    public void navigateToModule(String tab){
        String locator = "//span[.='" + tab + "']";
        Driver.get().findElement(By.xpath(locator)).click();
    }

    //method overloading
    public void navigateToModule(String tab, String module) {

        String tabLoc = "//span[.='" + tab + "']";
        String moduleLoc = "//span[.='" + module + "']";

        BrowserUtils.waitForClickablility(By.xpath(tabLoc), 5);
        WebElement tabElement = Driver.get().findElement(By.xpath(tabLoc));
        tabElement.click();

        BrowserUtils.waitForClickablility(By.xpath(moduleLoc),5);
        WebElement moduleElement= Driver.get().findElement(By.xpath(moduleLoc));
        moduleElement.click();

    }

    public String getAccountName(String accountName){
        return Driver.get().findElement(By.xpath("//span[.='"+accountName+"']")).getText();
    }

}

/**
 * Abstract class:
 * * is a restricted class that cannot be used to create objects
 * * (to access it, it must be inherited from another class).
 * Abstract method:
 * * can only be used in an abstract class,
 * * and it does not have a body.
 * * The body is provided by the subclass (inherited from).
 */
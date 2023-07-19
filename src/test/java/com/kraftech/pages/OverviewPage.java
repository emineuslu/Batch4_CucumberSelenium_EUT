package com.kraftech.pages;

import com.kraftech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends BasePage{

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement helperText;

    public String getHelperTextString(){
        //String expected = helperText.getText();
        //return expected;
        return helperText.getText();
    }

    public void tapOnTab(String str){
        //driver.findElement(By.xpath("//*[.='Alperen']));
        WebElement tab = Driver.get().findElement(By.xpath("//li/button[.='" + str + "']"));
        tab.click();
    }
}

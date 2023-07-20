package com.kraftech.stepDefinitions;

import com.kraftech.pages.DashboardPage;
import com.kraftech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DashboardMenu_StepDefs {

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        DashboardPage dashboardPage=new DashboardPage();
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
//        List<String> actualList=new ArrayList<>();
//        for (WebElement elm: dashboardPage.upTitles) {
//            actualList.add(elm.getText());
//        }
        List<String> actualList= BrowserUtils.getElementsText(dashboardPage.upTitles);
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedList,actualList);

    }
}

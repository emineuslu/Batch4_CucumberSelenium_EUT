package com.kraftech.stepDefinitions;

import com.kraftech.pages.LoginPage;
import com.kraftech.utilities.ConfigurationReader;
import com.kraftech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {
        loginPage.login(ConfigurationReader.get("teacherEmail"), ConfigurationReader.get("teacherPassword"));
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actual = Driver.get().getCurrentUrl();
        String expected = "https://www.krafttechexlab.com/index";
        Assert.assertEquals(expected,actual);
    }

    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {
        loginPage.login(ConfigurationReader.get("studentEmail"), ConfigurationReader.get("studentPassword"));
    }

    @When("The user enters developer credentials")
    public void theUserEntersDeveloperCredentials() {
        loginPage.login(ConfigurationReader.get("developerEmail"), ConfigurationReader.get("developerPassword"));
    }

    @When("The user enters SDET credentials")
    public void the_user_enters_sdet_credentials() {
        System.out.println("I entered SDET userEmail and password and click on login button");
    }
}

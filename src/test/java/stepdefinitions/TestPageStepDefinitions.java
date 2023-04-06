package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TestPage;

public class TestPageStepDefinitions {
    TestPage testPage = new TestPage();
    @Given("I enter username")
    public void i_enter_username() {
        testPage.username.setValue("techproed");

    }

    @Given("I enter password")
    public void i_enter_password() {
        testPage.password.setValue("SuperSecretPassword");

    }

    @Given("I enter submit button")
    public void i_enter_submit_button() {
        testPage.submitButton.click();

    }

}

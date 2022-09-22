package definition;

import automationbase.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step.LoginStep;

import static org.junit.Assert.assertTrue;


public class LoginStepDefinition extends Base {
    LoginStep loginStep = new LoginStep();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() throws InterruptedException {
        loginStep.clickOnSignButton();
    }
    @Then("user should be login")
    public void user_should_be_login() {
        assertTrue(loginStep.accountButtonIsDisplay());

    }
    @When("user enter a valid data email {string} and password {string}")
    public void userEnterAValidDataEmailAndPassword(String email, String password) {
        loginStep.completeForm(email,password);
    }
}

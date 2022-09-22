package definition;

import automationbase.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import step.SearchSteps;

import static org.junit.Assert.assertTrue;

public class SearchStepDefinition extends Base {
    SearchSteps searchSteps = new SearchSteps();
    @Given("user enter valid text on the search box")
    public void user_enter_valid_text_on_the_search_box() {
        searchSteps.performASearch();
    }
    @Then("a search result should appear")
    public void a_search_result_should_appear() {
        assertTrue(searchSteps.searchIconIsDisplay());
    }
}

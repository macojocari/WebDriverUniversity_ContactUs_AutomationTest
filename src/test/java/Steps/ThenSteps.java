package Steps;

import Pages.WebDriverUniversityPage;
import cucumber.api.java.en.Then;

public class ThenSteps {
    @Then("success message is displayed")
    public void thenSuccessMessageIsDisplayed() {
        WebDriverUniversityPage.checkMessage();
    }
}

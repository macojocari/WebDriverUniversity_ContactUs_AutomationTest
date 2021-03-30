package Steps;

import Pages.WebDriverUniversityPage;
import cucumber.api.java.en.Given;

public class GivenSteps {
    @Given("webdriveruniversity website is displayed")
    public void givenWebdriveruniversitWebsiteIsDisplayed() {
        WebDriverUniversityPage.initialize();
    }
}

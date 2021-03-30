package Steps;

import Pages.WebDriverUniversityPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class WhenSteps {
    @When("I click on CONTACT US")
    public void whenIClickOnCONTACTUS() {
        WebDriverUniversityPage.clickContactUs();
    }

    @When("I switch to another tab")
    public void andISwitchToAnotherTab() {
        ArrayList<String> tabs = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tabs.get(1));
    }

    @When("I filled out all fields")
    public void whenIFilledOutAllFields(DataTable dataTable) {
        List<String> contacts = dataTable.asList(String.class);
        WebDriverUniversityPage.inputFirstName(contacts.get(0));
        WebDriverUniversityPage.inputLastName(contacts.get(1));
        WebDriverUniversityPage.inputEmail(contacts.get(2));
        WebDriverUniversityPage.inputComments(contacts.get(3));
    }

    @When("I clicked on submit button")
    public void andIClickedOnSubmitButton() {
        WebDriverUniversityPage.clickSubmitButton();
    }
}

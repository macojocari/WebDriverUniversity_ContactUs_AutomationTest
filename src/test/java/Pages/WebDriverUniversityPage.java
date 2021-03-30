package Pages;

import Steps.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.AssertJUnit.assertEquals;

public class WebDriverUniversityPage {

    private static final String URL = "http://www.webdriveruniversity.com/";

    public static void initialize() {
        Driver.getDriver().get(URL);
        PageFactory.initElements(Driver.getDriver(), WebDriverUniversityPage.class);
    }

    @FindBy(xpath = "//h1")
    private static WebElement contactUs;

    @FindBy(name = "first_name")
    private static WebElement firstName;

    @FindBy(name = "last_name")
    private static WebElement lastName;

    @FindBy(name = "email")
    private static WebElement email;

    @FindBy(name = "message")
    private static WebElement comments;

    @FindBy(xpath = "//input[@value='SUBMIT']")
    private static WebElement submitButton;

    @FindBy(xpath = "//h1")
    private static WebElement successMessage;

    private static Actions actions = new Actions(Driver.getDriver());

    public static void clickContactUs() {
        actions.moveToElement(contactUs).click().build().perform();
    }

    public static void inputFirstName(String text) {
        firstName.sendKeys(text);
    }

    public static void inputLastName(String text) {
        lastName.sendKeys(text);
    }

    public static void inputEmail(String text) {
        email.sendKeys(text);
    }

    public static void inputComments(String text) {
        comments.sendKeys(text);
    }

    public static void clickSubmitButton() {
        actions.moveToElement(submitButton).click().perform();
    }

    public static void checkMessage() {
        String actualResult = successMessage.getText().trim();
        String expextedResult = "Thank You for your Message!";
        assertEquals(expextedResult, actualResult);
    }


}

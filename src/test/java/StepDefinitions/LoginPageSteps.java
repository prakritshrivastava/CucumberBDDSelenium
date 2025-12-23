package StepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    public static String actualTitle;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://practicetestautomation.com/practice-test-login/");
    }

    @When("User gets title of the page")
    public void user_gets_title_of_page() {
        actualTitle=loginPage.getLoginPageTitle();
    }

    @Then("Title should be {string}")
    public void title_should_be(String expectedTitle) {
        Assert.assertEquals(actualTitle,expectedTitle,"Page title does not match");
    }

    @And("user logs in successfully")
    public void userLogsInSuccessfully() {
        loginPage.enterUserName("student");
        loginPage.enterUserPassword("Password123");
        loginPage.clickLogin();
    }
}

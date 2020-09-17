package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.loginPageObject;

public class loginstepdefinitions {
    WebDriver driver;
    loginPageObject loginPage;

    @Given("^A cloud login page$")
    public void aCloudLoginPage(){

            System.setProperty("webdriver.gecko.driver",
                    "C:\\Users\\6495\\Desktop\\IntelliJ\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("http://performance-testing.co.za/Main/login.html");
        loginPage =
                PageFactory.initElements(driver, loginPageObject.class);

        String expectedTitle = "Cloud9 Airlines";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("^When I login with a valid user id and password$")
    public void whenILoginWithAValidUserIdAndPassword()  {
        loginPage.enterEmail("wsi99@netactive.co.za");
        loginPage.enterPassword("xxxxxx");
        loginPage.clickLogin();
        Assert.assertTrue(1==1);
    }

    @Then("^the login will be successful$")
    public void theLoginWillBeSuccessful() {
        WebElement body = driver.findElement(By.tagName("body"));
        String bodyText = body.getText();
        Assert.assertTrue("Landing page does not contain the text 'Page'", bodyText.contains("Page"));
    }
}

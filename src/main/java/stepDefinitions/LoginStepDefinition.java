package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {

    WebDriver driver;

    @Given("^User is already on login page$")
    public void user_is_already_on_login_page(){
        System.setProperty("webdriver.chrome.driver","/Users/anuraggarg/Desktop/FreeCRMBDDFramework/src/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://app.simplelogin.io/auth/login");
    }

    @When("^Title of page is Simple Login$")
    public void verify_title_of_page_is_simple_login(){
        Assert.assertTrue(driver.getTitle().trim().contains("SimpleLogin"));
    }

    @Then("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        driver.findElement(By.cssSelector("#email")).clear();
        driver.findElement(By.cssSelector("#email")).sendKeys(username);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("^User clicks on login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.cssSelector(".btn.btn-primary.btn-block")).click();
    }

    @Then("^User is on home page$")
    public void user_is_on_home_page() {
        Assert.assertTrue(driver.getTitle().trim().contains("Alias"));
    }

    @Then("Close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }

    @Then("User clicks on API Keys button")
    public void userClicksOnAPIKeysButton() {
        driver.findElement(By.xpath(".//a[contains(@href,'api')]")).click();
    }

    @Then("^User enters API Key name as \"(.*)\"$")
    public void userEntersAPIKeyNameAs(String api_key) {
        driver.findElement(By.id("name")).sendKeys(api_key);
    }

    @Then("User clicks on Create button")
    public void userClicksOnCreateButton() {
        driver.findElement(By.cssSelector(".btn-success")).click();
    }

    @Then("the card is created with name {string}")
    public void theCardIsCreatedWithName(String api_key_name) {
        System.out.println("Generated key is: "
                +driver.findElement(By.xpath("(.//*[@class='card-title'])[1]")).getText());
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='card-title'])[1]")).getText().equals(api_key_name));
    }
}

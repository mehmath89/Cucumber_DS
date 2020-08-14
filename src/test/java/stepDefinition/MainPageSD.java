package stepDefinition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import runnerTest.webPages.MainPage;
import utils.BasePage;

public class MainPageSD {

    public WebDriver driver;
    private MainPage mainPage = new MainPage();

    @Given("^I am on darksky page$")
    public void getUrl(){ Assert.assertEquals(BasePage.get().getTitle(), "Dark Sky - Broadway, New York, NY"); }

    @When("^I enter a city as Dayton into the search box on the darksky page$")
    public void sendAValueIntoSearchBox(){ mainPage.sendKeysIntoSearchBox(); }

    @And("^I click on search button on the darksky page$")
    public void clickTheSearchBtn(){ mainPage.clickOnSearchBtn(); }

    @And("^I got current temperature on the darksky page$")
    public void gettingCurrentTemp() throws InterruptedException {
        Thread.sleep(3000);
        mainPage.getCurrentTemp(); }

    @And("^I click Today button on the darksky page$")
    public void clickTodayBtn() throws InterruptedException {
        mainPage.clickOnToday();}

    @Then("^I got highest and lowest temperature and verify them on the darksky page$")
    public void getHighestAndLowestThenVerify() throws InterruptedException {
        Thread.sleep(4000);
        mainPage.getHighestAndLowestTempANdVerify(); }

    



}

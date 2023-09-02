package StepsDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModels.buyComputerPage;
import pageObjectModels.registerAccountPage;

public class buyComputerSteps {
    WebDriver driver;

    buyComputerPage buyComputerPage = new buyComputerPage();


    @Given("^Action to Elctronic button$")
    public void action_to_Elctronic_button() throws Throwable {
        buyComputerPage.setElectronicButton();
    }

    @Given("^Click Computer$")
    public void click_Computer() throws Throwable {

        buyComputerPage.setComputerButton();

    }

    @Given("^Click to Apple for filter$")
    public void click_to_Apple_for_filter() throws Throwable {
        buyComputerPage.setAppleFiter();

    }


    @Given("^Assert to installments$")
    public void assert_to_installments() throws Throwable {
        buyComputerPage.setInstallment();

    }

    @Given("^Add to basket$")
    public void add_to_basket() throws Throwable {
        buyComputerPage.setAddToBasket();

    }

    @Given("^Go to basket$")
    public void go_to_basket() throws Throwable {
        buyComputerPage.setGoToBasket();

    }

    @Given("^Continue to not register$")
    public void continue_to_not_register() throws Throwable {
        buyComputerPage.clickButtons();

    }

    @Given("^Enter to emailll\"([^\"]*)\"$")
    public void enter_to_emailll(String email) throws Throwable {
        buyComputerPage.setEmail(email);

    }

    @Given("^Enter to firstname \"([^\"]*)\"$")
    public void enter_to_firstname(String firstname) throws Throwable {

        buyComputerPage.setFirstname(firstname);
    }

    @Given("^Enter to lastname \"([^\"]*)\"$")
    public void enter_to_lastname(String lastname) throws Throwable {
        buyComputerPage.setLastname(lastname);
    }

    @Given("^Select to city$")
    public void select_to_city() throws Throwable {
        buyComputerPage.setCity();
    }

    @Given("^Select to district$")
    public void select_to_district() throws Throwable {
        buyComputerPage.setDistrict();

    }

    @Given("^Select to street$")
    public void select_to_street() throws Throwable {
        buyComputerPage.setStreet();

    }

    @Given("^Enter to adress \"([^\"]*)\"$")
    public void enter_to_adress(String adress) throws Throwable {
        buyComputerPage.setAdress(adress);

    }

    @Given("^Enter to adress handline \"([^\"]*)\"$")
    public void enter_to_adress_handline(String adressHandline) throws Throwable {
        buyComputerPage.setAdressHandline(adressHandline);

    }

    @Given("^Click to save button$")
    public void click_to_save_button() throws Throwable {
        buyComputerPage.setSaveButton();
    }


    @And("^Click to Macbook PRO$")
    public void clickToMacbookPRO() throws InterruptedException {
        buyComputerPage.setMacbookProM2();
    }

    @And("^Assert to New window$")
    public void assertToNewWindow() throws InterruptedException {
        buyComputerPage.assertNewWindow();

    }

    @And("^Assert to tel fail message$")
    public void assertToTelFailMessage() throws InterruptedException {
        buyComputerPage.setTelFailMessage();

    }


    @And("^Assert to tel fail mesage$")
    public void assertToTelFailMesage() throws InterruptedException {
        buyComputerPage.setTelFailMessage();
    }

    @And("^Click to information text$")
    public void clickToInformationText() throws InterruptedException {
        buyComputerPage.setClickInfoText();
    }

    @When("^Close to pop-up$")
    public void closeToPopUp() throws InterruptedException {
        buyComputerPage.setClickClose();
    }

    @Then("^Back to landing page$")
    public void backToLandingPage() throws InterruptedException {
        buyComputerPage.setClickLandingPage();
    }
}

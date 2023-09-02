package StepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModels.sellAtTrendyolPage;

public class sellAtTrendyolSteps {
    WebDriver driver;
    sellAtTrendyolPage sellAtTrendyolPage = new sellAtTrendyolPage();

    @Given("^Click to sell at Trendyol$")
    public void click_to_sell_at_Trendyol() throws Throwable {
        sellAtTrendyolPage.setClickToSellTrendyolButton();
    }

    @Given("^Click to apply Pazaryeri$")
    public void click_to_apply_Pazaryeri() throws Throwable {
        sellAtTrendyolPage.setClickPazyeri();

    }



    @Given("^Select to Company Type$")
    public void select_to_Company_Type() throws Throwable {
        sellAtTrendyolPage.setCompantType();
    }

    @Given("^Select to Cityy$")
    public void select_to_Cityy() throws Throwable {
        sellAtTrendyolPage.setCity();

    }

    @Given("^Write to tel \"([^\"]*)\"$")
    public void write_to_tel(String tel) throws Throwable {
        sellAtTrendyolPage.setTel(tel);

    }

    @Given("^Select to sell type category$")
    public void select_to_sell_type_category() throws Throwable {
        sellAtTrendyolPage.setSellTypeCategort();

    }



    @Given("^Select to districtt$")
    public void select_to_districtt() throws Throwable {
        sellAtTrendyolPage.setDistrict();

    }

    @Given("^Click to undertand button$")
    public void click_to_undertand_button() throws Throwable {
        sellAtTrendyolPage.setClickUnderstandButton();

    }

    @Given("^Click to Continue button$")
    public void click_to_Continue_button() throws Throwable {
        sellAtTrendyolPage.setClickContinueButton();

    }


    @And("^Write to Firstname and Lastname \"([^\"]*)\"$")
    public void writeToFirstnameAndLastname(String fullName) throws Throwable {
        sellAtTrendyolPage.setFullName(fullName);

    }

    @And("^Write to TC No \"([^\"]*)\"$")
    public void writeToTCNo(String tcNo) throws Throwable {
        sellAtTrendyolPage.setTcNo(tcNo);

    }

    @And("^Write to emaill \"([^\"]*)\"$")
    public void writeToEmaill(String email) throws Throwable {
        sellAtTrendyolPage.setEmail(email);
    }


    @And("^Enter to fullname \"([^\"]*)\"$")
    public void enterToFullname(String name) throws Throwable {
        sellAtTrendyolPage.setFullName(name);
    }

    @And("^Enter to emailll \"([^\"]*)\"$")
    public void enterToEmailll(String email) throws Throwable {
        sellAtTrendyolPage.setEmail(email);
    }

    @And("^Enter to tel \"([^\"]*)\"$")
    public void enterToTel(String tel) throws Throwable {
        sellAtTrendyolPage.setTel(tel);
    }

    @And("^Enter to TC No \"([^\"]*)\"$")
    public void enterToTCNo(String tc) throws Throwable {
        sellAtTrendyolPage.setTcNo(tc);
    }




    @Then("^Click button$")
    public void clickButton() throws InterruptedException {
        sellAtTrendyolPage.setButton();

    }




    @And("^Company title name \"([^\"]*)\"$")
    public void companyTitleName(String compannyTitle) throws Throwable {
        sellAtTrendyolPage.setCompanyTitleName(compannyTitle);

    }

    @When("^Vergi kimlik no \"([^\"]*)\"$")
    public void vergiKimlikNo(String vkNo) throws Throwable {
        sellAtTrendyolPage.setVkNo(vkNo);

    }


    @And("^Assert to website$")
    public void assertToWebsite() {

    }
}

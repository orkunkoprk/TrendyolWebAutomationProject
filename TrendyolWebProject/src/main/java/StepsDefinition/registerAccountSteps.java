package StepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjectModels.registerAccountPage;
import utilities.Driver;


public class registerAccountSteps {
    WebDriver driver;
    registerAccountPage registerAccountPage = new registerAccountPage();

    @Given("^Go to trendyol website$")
    public void go_to_trendyol_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/");

    }

    @Given("^Action to login button$")
    public void action_to_login_button() throws Throwable {
        registerAccountPage.setActionGirisYap();

    }

    @Given("^Click register button$")
    public void click_register_button() throws Throwable {
        registerAccountPage.setUyeOlButton();
    }

    @Given("^Click with Google register button$")
    public void click_with_Google_register_button() throws Throwable {
        registerAccountPage.setRegisterGoogleButton();

    }

    @Given("^Enter to email \"([^\"]*)\"$")
    public void xenter_to_email(String email) throws Throwable {
        registerAccountPage.setEmail(email);

    }


    @Given("^Assert to fail account message$")
    public void assert_to_fail_account_message() throws Throwable {
        registerAccountPage.setHataMesaji();

    }

    @Given("^Click with Facebook register button$")
    public void click_with_Facebook_register_button() throws Throwable {
        registerAccountPage.setFacebookButton();
    }

    @Given("^Click to login button$")
    public void click_to_login_button() throws Throwable {
        registerAccountPage.setLoginButton();

    }


    @Given("^Write to \"([^\"]*)\"$")
    public void write_to(String pass) throws Throwable {
        registerAccountPage.setGetEmail(pass);

    }

    @Given("^Select to woman or man$")
    public void select_to_woman_or_man() throws Throwable {
        registerAccountPage.setErkek();

    }

    @Given("^Click buttons$")
    public void click_buttons() throws Throwable {
        registerAccountPage.setClickButton();

    }

    @Given("^Click to register button$")
    public void click_to_register_button() throws Throwable {
        registerAccountPage.setRegisterButton();
    }


    @And("^Click cookies$")
    public void clickCookies() throws InterruptedException {
        registerAccountPage.setKabulEtcookie();

    }


    @And("^Click to continue buttonnn$")
    public void clickToContinueButtonnn() throws InterruptedException {
        registerAccountPage.setGetContinueButton();
    }

    @And("^Enter to password \"([^\"]*)\"$")
    public void enterToPassword(String password) throws Throwable {
        registerAccountPage.setSifre(password);

    }

    @And("^Enter to emaill \"([^\"]*)\"$")
    public void enterToEmaill(String kullaniciAdi) throws Throwable {
        registerAccountPage.setKullaniciAdi(kullaniciAdi);
    }

    @And("^Assert to fail account messagee$")
    public void assertToFailAccountMessagee() throws InterruptedException {
        registerAccountPage.setAssertPassword();
    }

    @And("^Write to email \"([^\"]*)\"$")
    public void writeToEmail(String mail) throws Throwable {
        registerAccountPage.setGetEmail(mail);

    }

    @And("^Write to password \"([^\"]*)\"$")
    public void writeToPassword(String pass) throws Throwable {
        registerAccountPage.setGetpassw(pass);
    }

    @Then("^Assert to fail account mesageee$")
    public void assertToFailAccountMesageee() throws InterruptedException {
        registerAccountPage.setRobotAssert();

    }
}

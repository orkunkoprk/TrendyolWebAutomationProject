package pageObjectModels;

import cucumber.api.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class buyComputerPage extends abstractClass {
    WebDriver driver;
    public buyComputerPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[@class='category-header navbar-first-cap'])[8]")
    private WebElement electronicButton;
    public void setElectronicButton() throws InterruptedException {
        actionFuntion(electronicButton);
    }
    @FindBy(xpath = "//a[text()='Bilgisayarlar']")
    private WebElement computerButton;
    public void setComputerButton() throws InterruptedException {
        clickFunction(computerButton);
    }
    @FindBy(xpath = "(//div[@class='chckbox'])[3]")
    private WebElement appleFiter;
    public void setAppleFiter() throws InterruptedException {
        clickFunction(appleFiter);
    }
    @FindBy(xpath = "(//span[@class='prdct-desc-cntnr-name hasRatings'])[1]")
    private WebElement macbookProM2;
    public void setMacbookProM2() throws InterruptedException {
      /*  Thread.sleep(500);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();",macbookProM2); */
        clickFunction(macbookProM2);
    }
    public void assertNewWindow() throws InterruptedException {
        newWindow();
    }

    @FindBy(xpath = "//div[@class='min-installment-amount-text']")
    private WebElement installment;
    public void setInstallment() throws InterruptedException {
        assetionFunction(installment,"Peşin Fiyatına 6 Taksit!");
        System.out.println("Toplam taksit: "+installment.getText());
    }
    @FindBy(xpath = "//button[@class='add-to-basket']")
    private WebElement addToBasket;
    public void setAddToBasket() throws InterruptedException {
        clickFunction(addToBasket);
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//a[text()='Sepete Git']")
    private WebElement goToBasket;
    public void setGoToBasket() throws InterruptedException {
        clickFunction(goToBasket);
    }
    @FindBy(xpath = "//button[text()='Anladım']")
    private WebElement anladimButton;
    @FindBy(xpath = "(//span[text()='Sepeti Onayla'])[2]")
    private WebElement sepetiOnaylaButton;
    @FindBy(xpath = "(//button[@class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-secondary'])[1]")
    private WebElement uyeOlmadanDevamEtButton;
    public void clickButtons() throws InterruptedException {
        clickFunction(anladimButton);
        clickFunction(sepetiOnaylaButton);
        clickFunction(uyeOlmadanDevamEtButton);
    }
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;
    public void setEmail(String email1) throws InterruptedException {
        Thread.sleep(5000);
        sendKeysFunction(email,email1);
    }
    @FindBy(xpath = "//input[@name='name']")
    private WebElement firstname;
    public void setFirstname(String firstname1) throws InterruptedException {
        sendKeysFunction(firstname,firstname1);
    }
    @FindBy(xpath = "//input[@name='surname']")
    private WebElement lastname;
    public void setLastname(String lastname1) throws InterruptedException {
        sendKeysFunction(lastname,lastname1);
    }
    @FindBy(xpath = "(//div[@class='ty-display-flex ty-bg-beige ty-relative ty-input ty-select ty-bordered ty-transition ty-input-medium'])[1]")
    private WebElement city;
    @FindBy(xpath = "(//div[@class='ty-select-option'])[1]")
    private WebElement selectCity;
    public void setCity() throws InterruptedException {
        clickFunction(city);
        clickFunction(selectCity);
    }
    @FindBy(xpath = "(//div[@class='ty-display-flex ty-bg-beige ty-relative ty-input ty-select ty-bordered ty-transition ty-input-medium'])[2]")
    private WebElement district;
    @FindBy(xpath = "//div[text()='Seyhan']")
    private WebElement selectDistrict;
    public void setDistrict() throws InterruptedException {
        clickFunction(district);
        clickFunction(selectDistrict);
    }
    @FindBy(xpath = "(//div[@class='ty-display-flex ty-bg-beige ty-relative ty-input ty-select ty-bordered ty-transition ty-input-medium'])[3]")
    private WebElement street;
    @FindBy(xpath = "//div[text()='İstiklal Mah']")
    private WebElement selectStreet;
    public void setStreet() throws InterruptedException {
        clickFunction(street);
        clickFunction(selectStreet);
    }
    @FindBy(xpath = "//textarea[@name='addressLine']")
    private WebElement adress;
    public void setAdress(String adress1) throws InterruptedException {
        sendKeysFunction(adress,adress1);
    }
    @FindBy(xpath = "//input[@name='addressName']")
    private WebElement adressHandline;
    public void setAdressHandline(String adressHandline1) throws InterruptedException {
        sendKeysFunction(adressHandline,adressHandline1);
    }
    @FindBy(xpath = "//button[@class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-primary']")
    private WebElement saveButton;
    public void setSaveButton() throws InterruptedException {
        clickFunction(saveButton);
    }
    @FindBy(xpath = "//span[text()='Lütfen telefon numarası giriniz']")
    private WebElement telFailMessage;
    public void setTelFailMessage() throws InterruptedException {
        String telFail="Lütfen telefon numarası giriniz";
        assetionFunction(telFailMessage,telFail);
        System.out.println("Teleon numarasının hatalı girişi: "+telFailMessage.getText());
    }
    @FindBy(xpath = "//span[@class='highlighted']")
    private WebElement clickInfoText;
    public void setClickInfoText() throws InterruptedException {
        clickFunction(clickInfoText);
    }
    @FindBy(css = ".ty-cross")
    private WebElement clickClose;
    public void setClickClose() throws InterruptedException {
        clickFunction(clickClose);
    }
    @FindBy(xpath = "//img[@alt='Trendyol']")
    private WebElement clickLandingPage;
    public void setClickLandingPage() throws InterruptedException {
        clickFunction(clickLandingPage);
        System.out.println("Testiniz başarıyla tamamlanmıştır! Tebrikler!");
    }











}

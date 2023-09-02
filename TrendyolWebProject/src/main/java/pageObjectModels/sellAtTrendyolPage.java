package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class sellAtTrendyolPage extends abstractClass{
    WebDriver driver;
    public sellAtTrendyolPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//a[@href='https://partner.trendyol.com/onboarding/satici-formu'])[1]")
    private WebElement clickToSellTrendyolButton;
    public void setClickToSellTrendyolButton() throws InterruptedException {
        clickFunction(clickToSellTrendyolButton);
    }
    @FindBy(xpath = "(//div[@class='content -medium'])[2]")
    private WebElement clickPazyeri;
    public void setClickPazyeri() throws InterruptedException {
        clickFunction(clickPazyeri);
    }
    @FindBy(xpath = "//input[@name='fullName']")
    private WebElement fullName;
    public void setFullName(String fullName1) throws InterruptedException {
        sendKeysFunction(fullName,fullName1);
    }
    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;
    public void setEmail(String email1) throws InterruptedException {
        sendKeysFunction(email,email1);
    }
    @FindBy(xpath = "(//select[@class='form-control custom-select placeholder'])[2]")
    private WebElement compantType;
    public void setCompantType() throws InterruptedException {
        selectFunction(compantType,"Şahıs");
    }
    @FindBy(xpath ="((//select[@class='form-control custom-select placeholder']))[2]")
    private WebElement city;
    public void setCity() throws InterruptedException {
        selectFunction(city,"Adana");
    }
    @FindBy(xpath = "//input[@name='phoneNumber']")
    private WebElement tel;
    public void setTel(String tel1) throws InterruptedException {
        sendKeysFunction(tel,tel1);
    }
    @FindBy(xpath = "(//select[@class='form-control custom-select placeholder'])[1]")
    private WebElement sellTypeCategort;
    public void setSellTypeCategort() throws InterruptedException {
        selectFunction(sellTypeCategort,"Elektronik");
    }
    @FindBy(xpath = "//input[@name='tcknOrVkn']")
    private WebElement tcNo;
    public void setTcNo(String tcNo1) throws InterruptedException {
        sendKeysFunction(tcNo,tcNo1);
    }
    @FindBy(xpath = "//select[@name='district']")
    private WebElement district;
    public void setDistrict() throws InterruptedException {
        selectFunction(district,"Seyhan");
    }
    @FindBy(xpath = "//input[@name='isApproveAgreement']")
    private WebElement clickUnderstandButton;
    public void setClickUnderstandButton() throws InterruptedException {
        clickFunction(clickUnderstandButton);
    }
    @FindBy(xpath = "(//div[@class='content -big'])[1]")
    private WebElement clickContinueButton;
    public void setClickContinueButton() throws InterruptedException {
        clickFunction(clickContinueButton);
    }
    @FindBy(xpath = "//input[@name='businessName']")
    private WebElement companyTitleName;
    public void setCompanyTitleName(String companyTitleName1) throws InterruptedException {
        sendKeysFunction(companyTitleName,companyTitleName1);
    }
    @FindBy(xpath = "//input[@name='tradeRegistrationNumber']")
    private WebElement vkNo;
    public void setVkNo(String vkNo1) throws InterruptedException {
        sendKeysFunction(vkNo,vkNo1);
    }
    @FindBy(xpath = "//input[@name='isApproveKVKKAgreement']")
    private WebElement button;
    public void setButton() throws InterruptedException {
        clickFunction(button);
        System.out.println("Tebrikler test başarıyla tamamlandı!");
    }


    @FindBy(xpath = "//span[@class='title']")
    private WebElement assertTitle;
    public void setAssertTitle() throws InterruptedException {
        assetionFunction(assertTitle," Trendyol Satıcı Başvurusu ");
        System.out.println("Doğru sayfadasınız!");
    }
}

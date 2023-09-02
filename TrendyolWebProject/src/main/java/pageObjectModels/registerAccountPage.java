package pageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class registerAccountPage extends abstractClass{
    WebDriver driver;
    public  registerAccountPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[@class='link-text']")
    private WebElement actionGirisYap;
    public void setActionGirisYap() throws InterruptedException {
        actionFuntion(actionGirisYap);
    }
    @FindBy(xpath = "//div[@class='signup-button signup-button-container']")
    private WebElement uyeOlButton;
    public void setUyeOlButton() throws InterruptedException {
        clickFunction(uyeOlButton);
    }
    @FindBy(xpath = "(//div[@class='q-layout social-login-button flex flex-1'])[2]")
    private WebElement registerGoogleButton;
    public void setRegisterGoogleButton() throws InterruptedException {
        clickFunction(registerGoogleButton);
    }
    @FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
    private WebElement email;
    public void setEmail(String email1) throws InterruptedException {
        sendKeysFunction(email,email1);
    }


    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    private WebElement robotDegilim;


    @FindBy(xpath = "//span[text()='Oturumunuz açılamadı']")
    private WebElement hataMesaji;
    public void setHataMesaji(){
        Assert.assertEquals(hataMesaji.getText(),"Oturumunuz açılamadı");
        System.out.println("Doğru bilgilendirme aldınız!");
    }
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement kabulEtcookie;
    public void setKabulEtcookie() throws InterruptedException {
        clickFunction(kabulEtcookie);
    }
    @FindBy(xpath = "//span[text()='Sonraki']")
    private WebElement getContinueButton;
    public void setGetContinueButton() throws InterruptedException {
        clickFunction(getContinueButton);
    }
    @FindBy(xpath ="(//div[@class='social-login-icon'])[1]")
    private WebElement facebookButton;
    public void setFacebookButton() throws InterruptedException {
        clickFunction(facebookButton);
    }
    @FindBy(xpath = "(//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'])[1]")
    private WebElement kullaniciAdi;
    public void setKullaniciAdi(String kullaniciAdi1) throws InterruptedException {
        sendKeysFunction(kullaniciAdi,kullaniciAdi1);
    }
    @FindBy(xpath = "(//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt'])[2]")
    private WebElement sifre1;
    public void setSifre(String sifre) throws InterruptedException {
        sendKeysFunction(sifre1,sifre);
    }
    @FindBy(xpath = "//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")
    private WebElement loginButton;
    public void setLoginButton() throws InterruptedException {
        clickFunction(loginButton);
    }
    @FindBy(xpath = "(//a[text()='Şifreni mi Unuttun?'])[2]")
    private WebElement assertPassword;
    public void setAssertPassword() throws InterruptedException {
        assetionFunction(assertPassword,"Şifreni mi Unuttun?");
        System.out.println("Kontrol başarıyla sağlanmıştır.");
    }
    @FindBy(xpath = "//input[@id='register-email']")
    private WebElement getEmail;
    public void setGetEmail(String email1) throws InterruptedException {
        sendKeysFunction(getEmail,email1);
    }
    @FindBy(xpath = "//input[@name='register-password']")
    private WebElement getpassw;
    public void setGetpassw(String pass) throws InterruptedException {
        sendKeysFunction(getpassw,pass);
    }
    @FindBy(xpath = "//span[text()='Erkek']")
    private WebElement erkek;
    public void setErkek() throws InterruptedException {
        clickFunction(erkek);
    }
    @FindBy(xpath = "(//div[@class='ty-mgr-2 ty-relative ty-checkbox-container'])[1]")
    private WebElement clickButton1;

   @FindBy(xpath = "(//div[@class='ty-mgr-2 ty-relative ty-checkbox-container'])[2]")
    private WebElement clickButton2;
    public void setClickButton() throws InterruptedException {
        clickFunction(clickButton1);
        clickFunction(clickButton2);
    }
    @FindBy(xpath = "(//span[text()='Üye Ol'])[2]")
    private WebElement registerButton;
    public void setRegisterButton() throws InterruptedException {
        clickFunction(registerButton);
    }
    @FindBy(xpath = "//span[@class='message']")
    private WebElement robotAssert;
    public void setRobotAssert() throws InterruptedException {
        assetionFunction(robotAssert,"Şifreniz 7 ile 64 karakter arasında olmalıdır.");
        System.out.println("Son test tamamlandı. Tebrikler!");
    }



}

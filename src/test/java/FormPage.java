import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

    AndroidDriver driver;

    public FormPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Navigation bar locator
    @AndroidFindBy(id = "com.ilyn.memorizealquran:id/ivNav")
    private WebElement navBar;

    public void setNavBar(){
        navBar.click();
    }

    // sign in button locator
    @AndroidFindBy(id = "com.ilyn.memorizealquran:id/tvSignIn")
    private WebElement signInBtn;

    public void setSignInBtn(){
        signInBtn.click();
    }

    //  login button locator and click function
    @AndroidFindBy(id = "com.ilyn.memorizealquran:id/tvLogin")
    private WebElement loginBtn;

    public void clickLoginBtn(){
        loginBtn.click();
    }

    // email form locator
    @AndroidFindBy(id = "com.ilyn.memorizealquran:id/etEmailId")
    private WebElement emailField;

    public void setEmailField(){
        emailField.sendKeys("bysltech7@gmail.com");
    }

    // password field
    @AndroidFindBy(id = "com.ilyn.memorizealquran:id/etLoginPass")
    private WebElement passField;

    public void setPassField(){
        passField.sendKeys("123456");
    }

    // sign in btn click
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign in\").instance(1)")
    private WebElement signInFinal;

    public void setSignInFinal(){
        signInFinal.click();
    }

    // Restore confirm
    @AndroidFindBy(id = "com.ilyn.memorizealquran:id/tvConfirm")
    private WebElement confirmBtn;

    public void setConfirmBtn(){
        confirmBtn.click();
    }
}

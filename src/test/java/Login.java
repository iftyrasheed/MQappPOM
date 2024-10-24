import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseClass{

    @Test
    public void loginWithExisting() throws InterruptedException {

        /*
        Test Case for login of Memorize Quran
         */

        FormPage formPage = new FormPage(driver);
        formPage.setNavBar();
        Thread.sleep(2000);

        formPage.setSignInBtn();
        Thread.sleep(2000);

        formPage.clickLoginBtn();
        Thread.sleep(2000);

        formPage.setEmailField();
        Thread.sleep(1000);

        formPage.setPassField();
        Thread.sleep(3000);

        formPage.setSignInFinal();
        Thread.sleep(2000);

        formPage.setConfirmBtn();
        Thread.sleep(2000);
    }
}

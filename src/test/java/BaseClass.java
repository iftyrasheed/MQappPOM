import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    AndroidDriver driver;
    @BeforeClass
    public void julyAppium() throws MalformedURLException, InterruptedException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Iftys device");
        options.setApp("D:\\appiumJuly\\JulyMemorizeQuran\\src\\test\\resources\\dummy.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4725/"), options);
        Thread.sleep(5000);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

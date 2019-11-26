package Demo;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class AnylineStart {

    public static AndroidDriver<AndroidElement> setup() throws Exception {


        /*Invoking the driver*/
        AndroidDriver<AndroidElement> driver;

        File fs = new File("src/test/Anyline OCR Scanner_v12_apkpure.com.apk");

        DesiredCapabilities dc = new DesiredCapabilities();

        /*These are parsed as JSON for the Appium server*/
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        dc.setCapability("appWaitPackage", "io.anyline.examples.store");
        dc.setCapability("appWaitActivity", "io.anyline.examples.onboarding.OnBoardingActivity");
        dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());


        /*Localhost*/
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, dc);

        return driver;
    }

}

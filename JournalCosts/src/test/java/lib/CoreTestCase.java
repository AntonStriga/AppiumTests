package lib;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CoreTestCase {

    protected RemoteWebDriver driver;

    @BeforeMethod
    protected void setUp() throws Exception
    {
        // zzz - for experiment
        driver = Platform.getInstance().getDriver();
        this.rotateScreenPortrait();
    }

    @AfterMethod
    protected void tearDown() {
        driver.quit();
    }

    protected void rotateScreenPortrait()
    {
        if (driver instanceof AppiumDriver) {
            AppiumDriver driver = (AppiumDriver) this.driver;
            driver.rotate(ScreenOrientation.PORTRAIT);
        } else {
            System.out.println("Method rotateScreenPortrait() does nothing for platform " + Platform.getInstance().getPlatformVariable());
        }
    }

    protected void rotateScreenLandscape()
    {
        if (driver instanceof AppiumDriver) {
            AppiumDriver driver = (AppiumDriver) this.driver;
            driver.rotate(ScreenOrientation.LANDSCAPE);
        } else {
            System.out.println("Method rotateScreenLandscape() does nothing for platform " + Platform.getInstance().getPlatformVariable());
        }
    }

//    protected void backgroundApp(int seconds)
//    {
//        if (driver instanceof AppiumDriver) {
//            AppiumDriver driver = (AppiumDriver) this.driver;
//            driver.runAppInBackground(seconds);
//        } else {
//            System.out.println("Method backgroundApp() does nothing for platform " + Platform.getInstance().getPlatformVariable());
//        }
//    }

}


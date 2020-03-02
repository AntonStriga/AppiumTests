package lib;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Platform {

    private static final String
            PLATFORM_IOS = "ios",
            PLATFORM_ANDROID = "android",
            ANDROID_APPLICATION = "d:\\Appium_workspace\\AppiumTests\\GeoLog\\src\\test\\apks\\geolog_test.apk",
            IOS_APPLICATION = "",
            ANDROID_APP_PACKAGE = "com.geolog",
            ANDROID_APP_ACTIVITY = ".ui.splash.SplashActivity",
            APPIUM_URL_TEMPLATE = "http://127.0.0.1:{PORT}/wd/hub";

    private static Platform instance;

    private Platform() {}

    private String getAppiumUrl()
    {
        return APPIUM_URL_TEMPLATE.replace("{PORT}",this.getAppiumPort());
    }

    public static Platform getInstance()
    {
        if (instance == null) {
            instance = new Platform();
        }
        return instance;
    }

    public RemoteWebDriver getDriver() throws Exception
    {
        URL URL = new URL(this.getAppiumUrl());

        if (this.isAndroid()) {
            return new AndroidDriver(URL,this.getAndroidDesiredCapabilities());
        } else if (this.isIOS()) {
            return  new IOSDriver(URL,this.getIosDesiredCapabiliities());
        } else {
            throw new Exception("Cannot detect type of driver. Platform variable: " + this.getPlatformVariable());
        }
    }

    public boolean isAndroid()
    {
        return isPlatform(PLATFORM_ANDROID);
    }

    public boolean isIOS()
    {
        return isPlatform(PLATFORM_IOS);
    }

    private DesiredCapabilities getAndroidDesiredCapabilities()
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","8.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage", ANDROID_APP_PACKAGE);
        capabilities.setCapability("appActivity", ANDROID_APP_ACTIVITY);
        capabilities.setCapability("app", ANDROID_APPLICATION);
        capabilities.setCapability("orientation","PORTRAIT");

        return capabilities;
    }

    private DesiredCapabilities getIosDesiredCapabiliities()
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("deviceName","iPhone X");
        capabilities.setCapability("platformVersion","11.2");
        capabilities.setCapability("app", IOS_APPLICATION);
        capabilities.setCapability("orientation","PORTRAIT");

        return capabilities;
    }

    private boolean isPlatform(String my_platform)
    {
        String platform = this.getPlatformVariable();
        return my_platform.equals(platform);
    }

    public String getPlatformVariable()
    {
        return System.getenv("PLATFORM");
    }

    public String getAppiumPort()
    {
        return System.getenv("APPIUM_PORT");
    }
}

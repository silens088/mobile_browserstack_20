package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static config.Project.projectConfig;
import static config.browserstack.BrowserStack.browserStackConfig;

public class BrowserStackMobileDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        // Set your access credentials
        //desiredCapabilities.setCapability("browserstack.user", "gost_Ivwegm");
        desiredCapabilities.setCapability("browserstack.user", browserStackConfig.user());
        //desiredCapabilities.setCapability("browserstack.key", "zH5CKdHLREaehYfagvDr");
        desiredCapabilities.setCapability("browserstack.key", browserStackConfig.key());

        // Set URL of the application under test
        //desiredCapabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
        desiredCapabilities.setCapability("app", browserStackConfig.app());

        // Specify device and os_version for testing
        //desiredCapabilities.setCapability("device", "Google Pixel 3");
        desiredCapabilities.setCapability("device", projectConfig.device());
        //desiredCapabilities.setCapability("os_version", "9.0");
        desiredCapabilities.setCapability("os_version", projectConfig.osVersion());

        // Set other BrowserStack capabilities
        //desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("project", projectConfig.project());
        //desiredCapabilities.setCapability("build", "browserstack-build-1");
        desiredCapabilities.setCapability("build", projectConfig.build());
        //desiredCapabilities.setCapability("name", "first_test");
        desiredCapabilities.setCapability("name", projectConfig.name());

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        return new AndroidDriver(getBrowserstackUrl(), desiredCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

package AppiumProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Activity2 {
    AndroidDriver<MobileElement> driver;
    String Title = "Greeting";
    String Note = "Hi Team welcome";
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceId", "9638696078000NT");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(serverURL, caps);
    }
    @Test
    public void CreateNewNote(){
        MobileElement addTitle = driver.findElementById("new_note_button");
        addTitle.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,20);
        MobileElement add_Title = driver.findElementById("editable_title");
        wait.until(ExpectedConditions.elementToBeClickable(add_Title));
        add_Title.click();
        add_Title.sendKeys(Title);
        driver.findElementById("edit_note_text").click();
        MobileElement add_Note = driver.findElementById("edit_note_text");
        add_Note.sendKeys(Note);
        driver.findElementByClassName("android.widget.ImageButton").click();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
package liveProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/crm/");
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        driver.close();

    }

}

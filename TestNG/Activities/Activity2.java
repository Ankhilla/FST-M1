package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        WebDriver driver = new  FirefoxDriver();
        driver.get("https://alchemy.hguy.co/crm/");
        String Title  = "SuiteCRM";
        WebElement pageURL = driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
        System.out.println("URL for header image: "+ pageURL.getAttribute("src"));
        driver.close();
    }
}

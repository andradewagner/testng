package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

    private WebDriver driver;

    @Test
    public void open() {
        driver.get("https://www.terra.com.br");
        driver.findElement(By.id("zaz-nb-plugin-menuBtn")).click();
    }

    @Test
    public void login() {

    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("user-data-dir=/home/wagner/snap/chromium/562/.config/chromium/Default");
        options.addArguments("headless");

        driver = new ChromeDriver(options);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.net.MalformedURLException;
import java.net.URL;

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
    public void beforeClass() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.setExperimentalOption("useAutomationExtension", false);
        //options.addArguments("user-data-dir=/home/wagner/snap/chromium/562/.config/chromium/Default");
        options.addArguments("headless");

        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), caps);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
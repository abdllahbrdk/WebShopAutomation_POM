package UTILS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseDriver {
    protected WebDriver driver;

    protected WebDriverWait wait;

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setUp(String browser){
        if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/abdullah/Documents/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get("http://demowebshop.tricentis.com/");
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/abdullah/Desktop/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            driver.get("http://demowebshop.tricentis.com/");
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //driver.quit();
    }
}

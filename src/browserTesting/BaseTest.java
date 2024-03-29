package browserTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import utility.Utility;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utility {

    public void openBrowser(String baseUrl) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}




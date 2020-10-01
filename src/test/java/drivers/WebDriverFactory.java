package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
/**
 * To run tests by Firefox browser run the following command
 * mvn clean verify -DwebDriver=firefox
 */
public class WebDriverFactory implements DriverSource {

    private WebDriver driver;

    @Override
    public WebDriver newDriver() {
        String driverName = System.getProperty("webDriver") == null ? "chrome" : System.getProperty("webDriver");
        if (driver == null) {
            switch (driverName) {
                case ("chrome"):
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-infobars", "--disable-extensions");
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    break;
                case ("firefox"):
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions option = new FirefoxOptions();
                    option.addArguments("--disable-infobars", "--disable-extensions");
                    driver = new FirefoxDriver(option);
                    driver.manage().window().maximize();
                    break;
            }
        }
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
    public static WebDriver getBrowser(String webBrowser) {
        if ("chrome".equals(webBrowser))
            return initializeChrome();
        else if ("firefox".equals(webBrowser))
            return initializeFirefox();
        else
            return initializeFirefox();
    }

    private static WebDriver initializeChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver initializeFirefox(){
        return new FirefoxDriver();
    }
}

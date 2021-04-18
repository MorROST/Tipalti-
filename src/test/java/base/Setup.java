package base;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;

public class Setup {

    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public static void bc(){
        setDriver("chrome");
    }

    private static void setDriver(String webbrowser){
        driver = DriverFactory.getBrowser(webbrowser);
        driver.manage().window().maximize();
    }

//    @AfterClass
//    public static void ac(){
//        driver.quit();
//    }
}

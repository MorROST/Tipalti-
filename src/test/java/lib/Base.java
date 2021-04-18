package lib;

import external.Payee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    private WebDriver driver;
    final String iFrameURL = "https://ui2.sandbox.tipalti.com/demo/iframe?h=";
    private Payee payee = new Payee("AutomationTest1");
    String payeeName;

    public Base(WebDriver driver){
        this.driver = driver;
    }
    public void getIframeUrl() {
        payee.clacIdap();
        String url = String.join("", iFrameURL, this.payee.getPayeeName(), this.payee.getPayerSuffix(), "&idap=", this.payee.getIdap(), "&cskin=Twitter");
        driver.get(url);
        driver.switchTo().frame("tipIframe");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions. visibilityOfElementLocated (By.cssSelector("div[class='step num-1 first current']")));
    }

}

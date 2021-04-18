package lib;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
public class BankDetails {

    public static final String BANK_NAME = "#BankName";
    public static final String NEXT_BTN = "/html/body/div/div[3]/div[1]/div/div[2]/div/input";
    private WebDriver driver;
    @FindBy(how = How.CSS, using = BANK_NAME)
    WebElement bankName;
    @FindBy(how = How.XPATH, using = NEXT_BTN)
    WebElement nextBtn;


    public BankDetails(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean fillBankAccount(){
        bankName.sendKeys("Bank Name");
        nextBtn.click();
        WebElement errorLabel = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div/div[2]/div[3]/div[1]"));
        return (errorLabel.isDisplayed() && bankName.isDisplayed());

    }

}


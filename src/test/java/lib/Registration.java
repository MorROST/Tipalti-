package lib;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
public class Registration {
    public static final String ADDRESS = "#Address";
    public static final String COUNTRY = "#Country";
    public static final String EMAIL = "#EmailAddress";
    public static final String FIRST_NAME = "#FirstName";
    public static final String MIDDLE_NAME = "#MiddleName";
    public static final String LAST_NAME = "#LastName";
    public static final String COMPANY = "#Company";
    public static final String SECOND_ADDRESS = "#Address2";
    public static final String CITY = "#City";
    public static final String ZIP = "#Zip";
    public static final String NEXT_BTN = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[1]";
    private WebDriver driver;
    @FindBy(how = How.CSS, using = EMAIL)
    WebElement emailField;
    @FindBy(how = How.CSS, using = FIRST_NAME)
    WebElement firstNameField;
    @FindBy(how = How.CSS, using = MIDDLE_NAME)
    WebElement middleNameField;
    @FindBy(how = How.CSS, using = LAST_NAME)
    WebElement lastNameField;
    @FindBy(how = How.CSS, using = COMPANY)
    WebElement company;
    @FindBy(how = How.CSS, using = ADDRESS)
    WebElement address;
    @FindBy(how = How.CSS, using = SECOND_ADDRESS)
    WebElement secondAddress;
    @FindBy(how = How.CSS, using = CITY)
    WebElement city;
    @FindBy(how = How.CSS, using = ZIP)
    WebElement zip;
    @FindBy(how = How.CSS, using = COUNTRY)
    WebElement country;
    @FindBy(how = How.XPATH, using = NEXT_BTN)
    WebElement nextBtn;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean signUp(Employee employee){
        if(employee.getEmail() == null ||
           employee.getEmp1stName() == null||
           employee.getEmpMiddleName() == null||
           employee.getEmpLastName() == null||
           employee.getCompany() == null||
           employee.getAddress() == null||
           employee.getSecAddress() == null||
           employee.getCity() == null||
           employee.getZip() == null||
           employee.getCountry() == null){
            System.out.println("Missing details");
            return false;
        }

        emailField.sendKeys(employee.getEmail());
        firstNameField.sendKeys(employee.getEmp1stName());
        middleNameField.sendKeys(employee.getEmpMiddleName());
        lastNameField.sendKeys(employee.getEmpLastName());
        company.sendKeys(employee.getCompany());
        address.sendKeys(employee.getAddress());
        secondAddress.sendKeys(employee.getSecAddress());
        city.sendKeys(employee.getCity());
        zip.sendKeys("" + employee.getZip());
        country.click();
        WebElement country =  driver.findElements(By.cssSelector(".countrySelectText"))
                .stream()
                .filter(element -> element
                        .getText().equals(employee.getCountry())).findFirst().orElseThrow(()->new RuntimeException());
        country.click();

        nextBtn.click();


        return true;
    }

    public int printAllCountriesOptions() {
        country.click();
        List<WebElement> elements = driver
                .findElements(By.cssSelector(".countrySelectText"));
        elements.forEach(element -> System.out.println(element.getText()));
        return elements.size();
    }

    public Boolean confirmRegistration(){
        Sleep sleep = new Sleep();
        sleep.doSleep(2000);
        WebElement confirmBtn = driver.findElement(By.xpath("//*[@id=\"ngdialog1\"]/div[2]/div[2]/button[1]"));
        confirmBtn.click();
        sleep.doSleep(7000);

        WebElement backBtn = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div[1]/div/input"));
        return (backBtn.isDisplayed());
    }
}


package test;

import base.Setup;
import external.Payee;
import lib.BankDetails;
import lib.Base;
import lib.Employee;
import lib.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MainTest extends Setup {

    private static WebDriver driver;
    Base base;
    Registration registration;
    BankDetails bankDetails;


    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    private void init() {
        base = new Base(driver);
        base.getIframeUrl();
        this.registration = PageFactory.initElements(driver, Registration.class);
        this.bankDetails = PageFactory.initElements(driver, BankDetails.class);

    }

    @Test
    public void printAllCountries(){
        init();
        int expectedCountries = 242;
        assertEquals(registration.printAllCountriesOptions(), expectedCountries);

    }

    @Test
    public void testRegistration()  {
        init();
        Employee employee = new Employee()
                .withEmail("mor@gmail.com")
                .withEmp1stName("Mor")
                .withEmpMiddleName("Bar")
                .withEmpLastName("Rost")
                .withCompany("Google")
                .withAddress("HaGilbowa 7")
                .withSecAddress("HaElla 9")
                .withCity("Raanana")
                .withZip(65665)
                .withCountry("Austria");
        assertTrue(registration.signUp(employee));
        assertTrue(registration.confirmRegistration());
        assertTrue(bankDetails.fillBankAccount());

    }

}

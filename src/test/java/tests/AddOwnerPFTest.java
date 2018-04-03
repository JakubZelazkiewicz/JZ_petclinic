package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AddOwnerPF;

import java.util.concurrent.TimeUnit;

public class AddOwnerPFTest {

    private WebDriver driver;
    private AddOwnerPF addOwnerPF;
    private static final String PAGE_URL = "http://localhost:8080/owners/new";

    String firsName = "Add";
    String lastName = "Block";
    String address = "Red street 5";
    String city = "New York";
    String telephone = "111222333";

@Before
    public void setUp (){
    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chrome\\chromedriver.exe");
    driver = new ChromeDriver();

    addOwnerPF = PageFactory.initElements(driver, AddOwnerPF.class );
    driver.get(PAGE_URL);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@After
public void tearDown(){
    driver.quit();
}

@Test
    public void setAddOwnerPFTest () {
    // FIRST NAME
    addOwnerPF.clickOnFirstNameField();
    addOwnerPF.sendKeysFirstName(firsName);

    //  LAST NAME
    addOwnerPF.clickOnLastNameField();
    addOwnerPF.sendKeysLastName(lastName);

    // ADDRESS
    addOwnerPF.clickOnAddressField();
    addOwnerPF.sendKeysAddress(address);

    // CITY
    addOwnerPF.clickOnCityField();
    addOwnerPF.sendKeysCity(city);

    //  TELEPHONE
    addOwnerPF.clickOnTelephoneField();
    addOwnerPF.sendKeysTelephone(telephone);

    // ADD OWNER BUTTON
    addOwnerPF.clickOnAddOwnerButton();

    // IS ADDED CHECK
    String xpathAddress = "//tr/td[contains(text(),'" + address +"')]";
    String isAddress = driver.findElement(By.xpath(xpathAddress)).getText();
    Assert.assertEquals(isAddress, address);
}


}

package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddOwnerPO;

import java.util.concurrent.TimeUnit;

public class AddOwnerPOTest {

    WebDriver driver;

    @Before
    public void setUP () {
    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chrome\\chromedriver.exe")   ;
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:8080/owners/new");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void AddOwnerPOTest(){
        AddOwnerPO addOwnerPO = new AddOwnerPO(driver);
        addOwnerPO.sendFirstName();
        addOwnerPO.sendLastName();
        addOwnerPO.sendAddress();
        addOwnerPO.sendCity();
        addOwnerPO.sendTelephone();
        addOwnerPO.clickOnAddOwnerButton();

        Assert.assertNotNull(driver.findElement(By.xpath("//h2[contains(text(),'Owner Information')]")));
    }
}

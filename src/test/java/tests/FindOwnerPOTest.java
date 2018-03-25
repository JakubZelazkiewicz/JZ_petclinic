package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.FindOwnerPO;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;


public class FindOwnerPOTest {

    WebDriver driver;


    @Before
     public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/owners/find");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

         }

    @Test
    public void findOwnerTestNegative() {
        FindOwnerPO findTest = new FindOwnerPO(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        findTest.sendNameNegative();
        findTest.clickFindOwnerButton();
        String commentTextN = findTest.getTextNotFound().getText();
        assertEquals("has not been found", commentTextN);

    }
    @Test
    public void findOwnerTestPositive() {
        FindOwnerPO findTest = new FindOwnerPO(driver);
        findTest.sendNamePositive();
        findTest.clickFindOwnerButton();
        String commentTextP = findTest.getTextPositive().getText();
        assertTrue(commentTextP!=null);


    }

}

package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.FindOwnerPF;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FindOwnerPFTest {

    private WebDriver driver;
    private FindOwnerPF findOwnerPF;

    String nameNegative = "Davvis";
    String namePositive = "Davis";


    private static final String PAGE_URL = "http://localhost:8080/owners/find";

    @Before
    public void setUp(){


        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();

        findOwnerPF = PageFactory.initElements(driver, FindOwnerPF.class);

        driver.get(PAGE_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
   @After
   public void tearDown() {
        driver.quit(); }

        @Test

        public void findOwnerTestNegative (){
        findOwnerPF.clickOwnerField();
        findOwnerPF.sendKeysOwnerFieldNegative(nameNegative);
        findOwnerPF.clickFindOwnerButton();
        String commentTextN = driver.findElement(By.className("help-inline")).getText();
        assertEquals("has not been found", commentTextN);
        }

         @Test

        public void findOwnerTestPositive (){
        findOwnerPF.clickOwnerField();
        findOwnerPF.sendKeysOwnerFieldPositive(namePositive);
        findOwnerPF.clickFindOwnerButton();
        String commentTextP = driver.findElement(By.xpath("//td/a[contains(text(),'Davis')]")).getText();
        Assert.assertNotNull(commentTextP);
    }

}

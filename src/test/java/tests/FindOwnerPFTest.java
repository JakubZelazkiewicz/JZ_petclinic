package tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.FindOwnerPF;

import java.util.concurrent.TimeUnit;

public class FindOwnerPFTest {

    private WebDriver driver;

    private FindOwnerPF findOwnerPF;

    private String namePositive = "Davis";
    ///public String nameNegative = "Davvis";

    private static final String PAGE_URL = "http://localhost:8080/owners/find";

    @Before
    public void setUp(){


        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        findOwnerPF = PageFactory.initElements(driver, FindOwnerPF.class);

        driver.get(PAGE_URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test

        public void findOwnerTestNegative (){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String nameNegative = "Davvis";

        findOwnerPF.clickOwnerField();
        findOwnerPF.sendKeysOwnerFieldNegative(nameNegative);



        }


}

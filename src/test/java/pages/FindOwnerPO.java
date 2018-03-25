package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindOwnerPO {

    WebDriver driver;

    By ownerField = By.id("lastName");
    By findOwnerButton = By.xpath("//button[@type='submit']");
    By addOwnerButton = By.xpath("//a[@class='btn btn-default']");
    String ownerPositive = "Davis";
    String ownerNegative = "Dawwwis";


    public FindOwnerPO (WebDriver driver) {
        this.driver=driver;
    }

    public void sendNamePositive (){
        driver.findElement(ownerField).sendKeys(ownerPositive);
    }

    public WebElement getTextPositive(){
        WebElement commentP = driver.findElement(By.xpath("//tr/td/a[contains(.,'Davis')]"));
        return commentP;
    }

    public void sendNameNegative (){
        driver.findElement(ownerField).sendKeys(ownerNegative);
    }

    public WebElement getTextNotFound(){
        WebElement commentN = driver.findElement(By.xpath("//p[contains(text(),'has not been found')]"));
        return commentN;
    }


    public void clickFindOwnerButton (){
        driver.findElement(findOwnerButton).click();
    }

    public void cickAddOwnerButton (){
        driver.findElement(addOwnerButton).click();
    }

//tr/td//a
}

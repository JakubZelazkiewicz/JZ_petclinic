package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOwnerPF {

    @FindBy (id = "lastName")
    private WebElement ownerField;

    @FindBy (xpath = "//button[@type='submit']")
    private WebElement findOwnerButton;

    @FindBy (linkText = "Add Owner")
    private WebElement addOwnerButton;


    public void clickOwnerField() {
        ownerField.click();
    }

        public void sendKeysOwnerFieldNegative(String nameNegative){
            ownerField.sendKeys(nameNegative);
        }

        public void sendKeysOwnerFieldPositive(String namePositive){
            ownerField.sendKeys(namePositive);
         }

         public void clickFindOwnerButton(){
             findOwnerButton.click();
         }


}

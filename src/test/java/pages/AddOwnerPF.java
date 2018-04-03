package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddOwnerPF {


    @FindBy(id = "firstName")
     private WebElement firstNameField;

      @FindBy(id = "lastName")
     private WebElement lastNameField;

      @FindBy(id = "address")
     private WebElement addressField;

      @FindBy(id = "city")
     private WebElement cityField;

      @FindBy(id = "telephone")
     private WebElement telefoneField;

      @FindBy(xpath = "//button[@class='btn btn-default']")
      private WebElement addOwnerButton;


        // FIRST NAME
        public void clickOnFirstNameField(){
        firstNameField.click();}

        public void sendKeysFirstName (String firsName) {
            firstNameField.sendKeys(firsName);
        }

        //  LAST NAME
        public void clickOnLastNameField () {
        lastNameField.click();
        }

        public void sendKeysLastName (String lastName) {
        lastNameField.sendKeys(lastName);
    }


        //  ADDRESS
        public void clickOnAddressField () {
        addressField.click();
        }

        public void sendKeysAddress (String address) {
            addressField.sendKeys(address);
        }

        //  CITY
        public void clickOnCityField () {
        cityField.click();
        }

        public void sendKeysCity (String city) {
            cityField.sendKeys(city);
        }

        //  TELEPHONE
        public void clickOnTelephoneField () {
        telefoneField.click();
        }

        public void sendKeysTelephone (String telephone) {
            telefoneField.sendKeys(telephone);
        }

        // ADD OWNER BUTTON
        public void clickOnAddOwnerButton (){
            addOwnerButton.click();
        }
}

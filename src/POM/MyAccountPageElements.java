package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageElements {

    public MyAccountPageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "termsofservice")
    public WebElement radioButton;

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    @FindBy(id = "BillingNewAddress_CountryId")
    public WebElement countryDropDown;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    public WebElement stateDropDown;

    @FindBy(id = "BillingNewAddress_City")
    public WebElement cityInput;

    @FindBy(id = "BillingNewAddress_Address1")
    public WebElement addressInput;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    public  WebElement zipInput;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    public WebElement phoneInput;

    @FindBy(css = "input[onclick='Billing.save()']")
    public WebElement continueButton;

    @FindBy(css = "input[name='removefromcart']")
    public WebElement radioButton2;
}

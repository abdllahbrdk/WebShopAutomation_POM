package TEST;

import POM.HomePageElements;
import POM.MyAccountPageElements;
import UTILS.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PlaceAnOrderTest extends BaseDriver {

    HomePageElements homePageElements;
    MyAccountPageElements myAccountPageElements;

    @Parameters({"userName","password","city","address","zip","phone"})
    @Test
    public void placeOrderFunction(String userName,String password,String city,String address,String zip,String phone) {
        homePageElements = new HomePageElements(driver);
        homePageElements.firstlogInButton.click();
        homePageElements.emailInput.sendKeys(userName);
        homePageElements.passwordInput.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(homePageElements.secondLoginButton)).click();
        Assert.assertTrue(homePageElements.validationEmail.isDisplayed());

        for (int i = 0; i < homePageElements.addToCardList.size(); i++) {
            homePageElements.addToCardList.get(1).click();
        }


        wait.until(ExpectedConditions.visibilityOf(homePageElements.shoppingCardButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(myAccountPageElements.radioButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(myAccountPageElements.checkoutButton)).click();



       /* Select select = new Select(myAccountPageElements.countryDropDown);
        select.selectByIndex(4);

        Select select1 = new Select(myAccountPageElements.stateDropDown);
        select1.selectByVisibleText("New Jersey");

        myAccountPageElements.cityInput.sendKeys(city);
        myAccountPageElements.addressInput.sendKeys(address);
       myAccountPageElements.zipInput.sendKeys(zip);
        myAccountPageElements.phoneInput.sendKeys(phone);

        myAccountPageElements.continueButton.click();*/
    }
}

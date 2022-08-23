package TEST;

import POM.HomePageElements;
import POM.LoginPageElements;
import POM.MyAccountPageElements;
import UTILS.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginFunctionTest extends BaseDriver {

    String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
            "The credentials provided are incorrect";

    HomePageElements homePageElements;


    @Parameters({"userName","password"})
    @Test
    public void loginFunctionTest(String userName,String password){
        homePageElements = new HomePageElements(driver);
        homePageElements.firstlogInButton.click();
        homePageElements.emailInput.sendKeys(userName);
        homePageElements.passwordInput.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(homePageElements.secondLoginButton)).click();
        Assert.assertTrue(homePageElements.validationEmail.isDisplayed());
    }

    @Parameters({"userName","password"})
    @Test
    public void loginFunctionTest2(String userName,String password){
        homePageElements = new HomePageElements(driver);
        homePageElements.firstlogInButton.click();
        homePageElements.emailInput.sendKeys(userName);
        homePageElements.passwordInput.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(homePageElements.secondLoginButton)).click();

        Assert.assertTrue(homePageElements.unableToLoginMessage.isDisplayed());
        Assert.assertEquals(homePageElements.unableToLoginMessage.getText(),expectedMessage);
    }
}

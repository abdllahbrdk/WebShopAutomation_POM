package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageElements {
    public HomePageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement firstlogInButton;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(css = "input[class='button-1 login-button']")
    public WebElement secondLoginButton;

    @FindBy(xpath = "//a[text()='thor1@gmail.com']")
    public WebElement validationEmail;

    @FindBy(css = "div[class='validation-summary-errors']")
    public WebElement unableToLoginMessage;

    @FindAll(@FindBy(css = "input[value='Add to cart']"))
    public List<WebElement> addToCardList;

    @FindBy(xpath = "(//a[@class='ico-cart'])[1]")
    public WebElement shoppingCardButton;


}

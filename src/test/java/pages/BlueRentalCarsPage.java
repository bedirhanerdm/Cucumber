package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPage {

    public BlueRentalCarsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//a[normalize-space()='Login']")
    public WebElement logInButton;

    @FindBy (xpath = "//input[@id='formBasicEmail']")
    public WebElement email;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement logInButton2;

    @FindBy (xpath = "//div[contains(text(),'invalid credentials')]")
    public WebElement invalidInfo;

}

package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement userNameTextBox;
    @FindBy(id = "txtPassword")
    public WebElement passwordTextBox;
    @FindBy(id ="btnLogin" )
    public WebElement loginBtn;
    @FindBy(xpath = "//span[@id='spanMessage']")
    public WebElement wrongCredentials;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}

package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Login extends CommonMethods {
    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
      openBrowserAndLaunchApplication();
    }
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {

        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        sendText(userNameTextBox, ConfigReader.getPropertyValue("username"));

        WebElement passwordTextBox=driver.findElement(By.id("txtPassword"));
        sendText(passwordTextBox, ConfigReader.getPropertyValue("password"));
    }
    @When("click on login button")
    public void click_on_login_button() {
        WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        doClick(loginBtn);
    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        boolean userloggedIn=driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed();
        if (userloggedIn){
            System.out.println("User is logged in successfully");
        }
    }
    @Then("Close the browser")
    public void close_the_browser() {
       closeBrowser();
    }
    @When("user enters  username {string} and  password {string}")
    public void user_enters_username_and_password(String username, String password) {
        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        sendText(userNameTextBox, username);

        WebElement passwordTextBox=driver.findElement(By.id("txtPassword"));
        sendText(passwordTextBox,password);
    }
    @When("get message wrong credentials")
    public void get_message_wrong_credentials() {
        WebElement wrongCredentials=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        getShownText(wrongCredentials);
        String text=wrongCredentials.getText();
        if (text.equalsIgnoreCase("Username cannot be empty")){
            System.out.println("test passed");
        } else if (text.equalsIgnoreCase("Password cannot be empty")) {
            System.out.println("test passed");
        }else if (text.equalsIgnoreCase("Invalid credentials")) {
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
    }

}

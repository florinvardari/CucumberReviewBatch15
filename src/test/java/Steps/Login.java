package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class Login extends CommonMethods {
    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
      openBrowserAndLaunchApplication();
    }
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        sendText(login.userNameTextBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextBox, ConfigReader.getPropertyValue("password"));
    }
    @When("click on login button")
    public void click_on_login_button() {
        doClick(login.loginBtn);
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
        sendText(login.userNameTextBox, username);
        sendText(login.passwordTextBox,password);
    }
    @When("get message wrong credentials")
    public void get_message_wrong_credentials() {
        getShownText(login.wrongCredentials);
        String text=login.wrongCredentials.getText();
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
    @When("user enters  {string} and  {string}")
    public void user_enters_and(String username, String password) {
     sendText(login.userNameTextBox, username);
     sendText(login.passwordTextBox, password);
    }
    @When("get message {string}")
    public void get_message(String errorMsg) {
       validateCredentials(login.wrongCredentials, errorMsg);
    }

}

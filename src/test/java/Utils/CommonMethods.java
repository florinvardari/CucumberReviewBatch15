package Utils;

import Steps.PageInitializer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public  static  void openBrowserAndLaunchApplication(){
        ConfigReader.readProperties();

        String browserType=ConfigReader.getPropertyValue("browserType");
        switch (browserType){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "Firefox":
                driver=new FirefoxDriver();
                break;
            case "IE":
                driver=new InternetExplorerDriver();
                break;
            default:
                driver=new EdgeDriver();
                break;
        }



        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));
        initializePageObject();
    }
    public static void closeBrowser(){
        driver.close();
    }

    public static void doClick(WebElement element){
        // we can add explicit wait so we dont have to do it all the time
        element.click();

    }

    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
    public static void getShownText(WebElement element){
        element.getText();
    }
    public static void validateCredentials(WebElement element, String msg){


    }
}

package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmpBtn;
    @FindBy(id = "menu_pim_addEmployee")
    public WebElement addEmployeeBtn;

    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "middleName")
    public WebElement middleNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;


    public  AddEmployeePage(){

        PageFactory.initElements(driver,this);
    }
}
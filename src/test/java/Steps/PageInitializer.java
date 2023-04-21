package Steps;

import Pages.AddEmployeePage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Utils.CommonMethods;

public class PageInitializer {

    public static LoginPage login;

    public static AddEmployeePage addEmp;
    public static DashboardPage dash;
    public static void initializePageObject(){
        login=new LoginPage();
        addEmp=new AddEmployeePage();
        dash=new DashboardPage();
    }
}

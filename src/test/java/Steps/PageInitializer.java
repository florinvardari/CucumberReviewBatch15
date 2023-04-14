package Steps;

import Pages.LoginPage;
import Utils.CommonMethods;

public class PageInitializer {

    public static LoginPage login;

    public static void initializePageObject(){
        login=new LoginPage();
    }
}

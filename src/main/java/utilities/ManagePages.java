package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.grafana.AddNewUserPage;
import pageObjects.grafana.EditUserPage;
import pageObjects.grafana.ServerAdminMainPage;
import pageObjects.grafana.ServerAdminMenuPage;

public class ManagePages extends Base{

    /*
###############################################################################
call the drivers belong grafana from the class
###############################################################################
*/
    public static void initGrafana(){
        grafanaLogin = PageFactory.initElements(driver, pageObjects.grafana.LoginPage.class);
        grafanaMain = PageFactory.initElements(driver, pageObjects.grafana.MainPage.class);
        grafanaLeftMenu = PageFactory.initElements(driver, pageObjects.grafana.LeftMenuPage.class);
        grafanaServerAdmin = PageFactory.initElements(driver, ServerAdminMenuPage.class);
        grafanaServerAdminMain = PageFactory.initElements(driver, ServerAdminMainPage.class);
        grafanaAddNewUsers = PageFactory.initElements(driver, AddNewUserPage.class);
        grafanaEditUser = PageFactory.initElements(driver, EditUserPage.class);

    }

    /*
###############################################################################
call the drivers belong mortgage from the class
###############################################################################
*/
    public static void initMortgage() {
        martgageMain = new pageObjects.mortgage.MainPage(mobileDriver);
    }
    /*
###############################################################################
call the drivers belong todo from the class
###############################################################################

     */
    public static void initToDo() {
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }
    /*
###############################################################################
call the drivers belong calculator from the class
###############################################################################
*/
    public static void initCalculator() {
        calcMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }
}

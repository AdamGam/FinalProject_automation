package workflows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

    @Step("Business Flow: Login to Grafana")
    public static void login(String user, String pass){
        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, pass);
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @Step("Business Flow: Login to Grafana with DB Credentials")
    public static void loginDB(){
        String query = "SELECT name, password FROM Employees WHERE id ='3'";
        List<String> cred = DBActions.getCredentials(query);
        UIActions.updateText(grafanaLogin.txt_username, cred.get(0));
        UIActions.updateText(grafanaLogin.txt_password, cred.get(1));
        UIActions.click(grafanaLogin.btn_login);
        UIActions.click(grafanaLogin.btn_skip);
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
    }

    @Step("Business Flow: Create new user")
    public static void createNewUsers(String name, String email, String userName, String pass){
        UIActions.click(grafanaServerAdminMain.btn_newUser);
        UIActions.updateText(grafanaAddNewUsers.txt_name, name);
        UIActions.updateText(grafanaAddNewUsers.txt_email, email);
        UIActions.updateText(grafanaAddNewUsers.txt_userName, userName);
        UIActions.updateText(grafanaAddNewUsers.txt_password, pass);
        UIActions.click(grafanaAddNewUsers.btn_create);


    }

    @Step("Business Flow: Delete last user")
    public static void deleteLastUser(){

        UIActions.click(grafanaServerAdminMain.rows.get(grafanaServerAdminMain.rows.size()-1));
        UIActions.click(grafanaEditUser.btn_deleteUser);
        UIActions.click(grafanaEditUser.btn_configDeleteUser);

    }

    @Step("Business Flow: Search Verify user")
    public static void SearchVerifyUser(String user, String shouldExists){
        UIActions.updateTextHuman(grafanaServerAdminMain.txt_search, user);
        if (shouldExists.equalsIgnoreCase("exists"))
            Verifications.existanceOfElement(grafanaServerAdminMain.rows);
        else if (shouldExists.equalsIgnoreCase("not-exists"))
            Verifications.nonExistanceOfElement(grafanaServerAdminMain.rows);
        else throw new RuntimeException("Invalid Excepted Output Option in Data Driven testing, should be exists or not-exists");
    }
}

package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

import java.util.concurrent.TimeUnit;

@Listeners({utilities.Listeners.class})
public class GrafanaWeb extends CommonOps {

    @Test(description = "Test01 - Verify Header")
    @Description("This Test login and verifies the main header")
    public void test01_verifyHeader(){
        WebFlows.login(getData("UserName"), getData("Password"));
        Verifications.verifyTextElement(grafanaMain.head_Dashboard, "Welcome to Grafana");

    }
    @Test(description = "Test02 - Verify Default Users")
    @Description("This Test login and verifies the Default Users")
    public void test02_verifyDefaultUsers(){
        UIActions.mouseHover(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        Verifications.numberOfElements(grafanaServerAdminMain.rows,1);
    }
    @Test(description = "Test03 - Verify  News Users")
    @Description("This Test login and verifies the News Users")
    public void test03_verifyNewUser(){
        UIActions.mouseHover(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        WebFlows.createNewUsers("Adam","aaa@bbb.com", "bba", "12345");
        Verifications.numberOfElements(grafanaServerAdminMain.rows,2);

    }
    @Test(description = "Test04 - Verify User Deletion")
    @Description("This Test verifies the deletion of a user")
    public void test04_verifyUserDeletion(){
        UIActions.mouseHover(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        WebFlows.deleteLastUser();
//        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        Verifications.numberOfElements(grafanaServerAdminMain.rows,1);
    }
    @Test(description = "Test05 - Verify Progress Steps")
    @Description("This Test and verifies the default Progress Steps are displayed (using soft assertion)")
    public void test05_verifyProgressSteps(){
        Verifications.visibilityOfElements(grafanaMain.list_progressSteps);
    }
    @Test(description = "Test06 - Verify Avatar Icon")
    @Description("This Test and verifies the Avatar Image Using Sikuli tool")
    public void test06_VerifyAvatarIcon(){
        Verifications.visualElement("GrafanaAvatar");
    }
    @Test(description = "Test07 - Search Users", dataProvider = "data-provider-users", dataProviderClass = utilities.ManageDDT.class)
    @Description("This Test Searching in table using DDT")
    public void test07_SearchUsers(String user, String shouldExist){
        UIActions.mouseHover(grafanaLeftMenu.btn_server, grafanaServerAdmin.link_users);
        WebFlows.SearchVerifyUser(user, shouldExist);
    }


}

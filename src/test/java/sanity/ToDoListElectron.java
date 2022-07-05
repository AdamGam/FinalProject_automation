package sanity;


import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ElectronFlows;



@Listeners({utilities.Listeners.class})
public class ToDoListElectron extends CommonOps {

    @Test(description = "Test01 - Add And Verify New Task")
    @Description("This Test Add New Task In The List ")
    public void test01_AddAndVerifyNewTask() {
        ElectronFlows.addNewTask("Learn Java");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTask(), 1);
    }

    @Test(description = "Test02 - Add And Verify New Task")
    @Description("This Test Add New Task In The List ")
    public void test02_AddAndVerifyNewTask() {
        ElectronFlows.addNewTask("Learn Java");
        ElectronFlows.addNewTask("Learn C#");
        ElectronFlows.addNewTask("Learn Python");
        Verifications.verifyNumber(ElectronFlows.getNumberOfTask(), 3);
    }
}

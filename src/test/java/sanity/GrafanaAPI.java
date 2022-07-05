package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.ApiFlows;

import java.util.concurrent.TimeUnit;
@Listeners({utilities.Listeners.class})
public class GrafanaAPI extends CommonOps {

    @Test(description = "Test 01: Get Team From Grafana")
    @Description("This Test Verify Team Property")
    public void test01_verifyTeam() {
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[0].name"),"lions");

    }
    @Test(description = "Test 02: Add Team and Verify")
    @Description("This Test add a Team to Grafana")
    public void test02_addTeamAndVerify() {
        ApiFlows.postTeam("rrrTeam", "rrr@aaa.com");
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[1].name"),"rrrTeam");

    }

    @Test(description = "Test 03: Update Team And Verify")
    @Description("This Test Updates a Team in Grafana and Verify it")
    public void test03_updateTeamAndVerify() {
        String id = ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.updateTeam("rrrTeam", "rrr@mimi.com", id);
        Verifications.verifyText(ApiFlows.getTeamProperty("teams[1].email"),"rrr@mimi.com");


    }



    @Test(description = "Test 04: Delete Existing Team From Grafana")
    @Description("This Test Delete a Team From Grafana and Verify")
    public void test04_deleteExistingTeam() {
        String id = ApiFlows.getTeamProperty("teams[1].id");
        ApiFlows.deleteTeam(id);
        Verifications.verifyText(ApiFlows.getTeamProperty("totalCount"),"1");


    }
}

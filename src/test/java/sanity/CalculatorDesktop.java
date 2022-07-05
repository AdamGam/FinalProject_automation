package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.DesktopFlows;
import workflows.ElectronFlows;

import java.util.concurrent.TimeUnit;

@Listeners({utilities.Listeners.class})
public class CalculatorDesktop extends CommonOps {

    @Test(description = "Test01 - Calculate numbers")
    @Description("CalculateNumbers")
    public void test01_CalculateNumbers() {
        DesktopFlows.calculateAddition();
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        Verifications.verifyTextElement(calcMain.field_result,"Display is 9");

    }
}

package workflows;

import extensions.MobileActions;
import io.appium.java_client.MobileSelector;
import io.qameta.allure.Step;
import utilities.CommonOps;


public class MobileFlow extends CommonOps {

    @Step("Business Flow: Fill Form Calculate Mortgage")
    public static void calculateMortgage(String amount, String term, String rate) {
        MobileActions.updateText(martgageMain.txt_amount, amount);
        MobileActions.updateText(martgageMain.txt_term, term);
        MobileActions.updateText(martgageMain.txt_rate, rate);
        MobileActions.tap(martgageMain.btn_Calculate);
    }
}

package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/*
###############################################################################
Description : buttons name on objects in grafana left menu
###############################################################################
*/

public class LeftMenuPage {
    @FindBy(how = How.XPATH, using = "//li[@class='css-16buu1m'][3]")
    public WebElement btn_alerting;

    @FindBy(how = How.XPATH, using = "//li[@class='css-16buu1m'][4]")
    public WebElement btn_configuration;

    @FindBy(how = How.XPATH, using = "//li[@class='css-16buu1m'][5]")
    public WebElement btn_server;
}

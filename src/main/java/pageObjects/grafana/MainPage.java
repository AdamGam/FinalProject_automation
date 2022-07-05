package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/*
###############################################################################
Description : buttons name on objects in grafana main page
###############################################################################
*/

public class MainPage {
    @FindBy(how = How.XPATH, using = "//div[@class='css-1m290ug']/h1")
    public WebElement head_Dashboard;

    @FindBy(how = How.XPATH, using = "//div[@class='css-12ve8b']")
    public List<WebElement> list_progressSteps;

}

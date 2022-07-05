package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;


/*
###############################################################################
Description : buttons name on objects in grafana edit user
###############################################################################
*/

public class EditUserPage {

    @FindBy(how = How.XPATH, using = "//div/button/span[text()='Delete user']")
    public WebElement btn_deleteUser;

    @FindBy(how = How.XPATH, using = "//div[@class='css-1pvl9up-layoutChildrenWrapper'][2]")
    public WebElement btn_configDeleteUser;
}

package pageObjects.grafana;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/*
###############################################################################
Description : buttons name on objects in grafana add new user
###############################################################################
*/

public class AddNewUserPage {

    @FindBy(how = How.CSS, using = "input[id='name-input']")
    public WebElement txt_name;

    @FindBy(how = How.CSS, using = "input[id='email-input']")
    public WebElement txt_email;

    @FindBy(how = How.CSS, using = "input[id='username-input']")
    public WebElement txt_userName;

    @FindBy(how = How.CSS, using = "input[id='password-input']")
    public WebElement txt_password;

    @FindBy(how = How.CSS, using = "button[class='css-1sara2j-button']")
    public WebElement btn_create;


}

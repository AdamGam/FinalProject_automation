package pageObjects.calculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/*
###############################################################################
Description : buttons name on objects in calculator application
###############################################################################
*/

public class MainPage {

    @FindBy(how = How.NAME, using = "One")
    public WebElement btn_one;

    @FindBy(how = How.NAME, using = "Two")
    public WebElement btn_Two;

    @FindBy(how = How.NAME, using = "Three")
    public WebElement btn_Three;

    @FindBy(how = How.NAME, using = "Four")
    public WebElement btn_Four;

    @FindBy(how = How.NAME, using = "Five")
    public WebElement btn_Five;

    @FindBy(how = How.NAME, using = "Six")
    public WebElement btn_Six;

    @FindBy(how = How.NAME, using = "Seven")
    public WebElement btn_Seven;

    @FindBy(how = How.NAME, using = "Eight")
    public WebElement btn_Eight;

    @FindBy(how = How.NAME, using = "Nine")
    public WebElement btn_Nine;

    @FindBy(how = How.NAME, using = "Zero")
    public WebElement btn_Zero;

    @FindBy(how = How.NAME, using = "Plus")
    public WebElement btn_Plus;

    @FindBy(how = How.NAME, using = "Equals")
    public WebElement btn_Equals;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId = 'CalculatorResults']")
    public WebElement field_result;

    @FindBy(how = How.NAME, using = "Clear")
    public WebElement btn_Clear;

}


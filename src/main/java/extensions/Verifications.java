package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;


public class Verifications extends CommonOps {

    @Step("Verify Text Element")
    public static void verifyTextElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }

    @Step("Verify Number Of Elements")
    public static void numberOfElements(List<WebElement> elems, int expected){
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(), expected);
    }

    @Step("Verify Visibility Of Elements( Soft-Assertion)")
    public static void visibilityOfElements(List<WebElement> elems) {
        for(WebElement elem : elems){
            softAssert.assertTrue(elem.isDisplayed(),"Sorry " + elem.getText() + " not displayed");
        }
        softAssert.assertAll("some elements were not displayed");
    }

    @Step("Verify Element Visually")
    public static void visualElement(String exceptedImageName) {
        try {
            screen.find(getData("ImageRepo") + exceptedImageName + ".png");
        } catch (FindFailed e) {
            System.out.println("Error Comparing Image File: " + e);
            fail("Error Comparing Image File: " + e);
        }

    }

    @Step("Verify Element Displayed")
    public static void existanceOfElement(List<WebElement> elements) {
        assertTrue(elements.size() > 0);
    }

    @Step("Verify Element Is Not Displayed")
    public static void nonExistanceOfElement(List<WebElement> elements) {
        assertFalse(elements.size() > 0);

    }

    @Step("Verify Text")
    public static void verifyText(String actual, String expected) {
        assertEquals(actual, expected);
    }

    @Step("Verify With Number")
    public static void verifyNumber(int actual, int expected) {
        assertEquals(actual, expected);
    }
}

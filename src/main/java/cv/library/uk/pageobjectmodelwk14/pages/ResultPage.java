package cv.library.uk.pageobjectmodelwk14.pages;

import com.aventstack.extentreports.Status;
import cv.library.uk.pageobjectmodelwk14.customlisteners.CustomListeners;
import cv.library.uk.pageobjectmodelwk14.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ResultPage extends Utility {

    //  Locators - resultText --> verifyTheResults(String expected)
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;
    public void verifytheResult(String excepted) {
        String actualText = getTextFromElement(resultText);
        String expectedText = excepted;
        Assert.assertEquals(actualText, expectedText, "Verify Results Title");
        Reporter.log("Verify result title" + resultText.toString() + "<br>");
        CustomListeners.test.log(Status.PASS,"Verify results");
    }

}
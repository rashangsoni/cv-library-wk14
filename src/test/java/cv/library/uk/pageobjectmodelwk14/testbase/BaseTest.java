package cv.library.uk.pageobjectmodelwk14.testbase;

import cv.library.uk.pageobjectmodelwk14.propertyreader.PropertyReader;
import cv.library.uk.pageobjectmodelwk14.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser"); //"Chrome"
    @BeforeMethod(alwaysRun = true)

    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod

    public void tearDown(){
        closeBrowser();
    }

}
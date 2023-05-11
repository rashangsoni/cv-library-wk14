package cv.library.uk.pageobjectmodelwk14.testsuite;

import cv.library.uk.pageobjectmodelwk14.customlisteners.CustomListeners;
import cv.library.uk.pageobjectmodelwk14.pages.HomePage;
import cv.library.uk.pageobjectmodelwk14.pages.ResultPage;
import cv.library.uk.pageobjectmodelwk14.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class, groups = {"sanity", "regression"})
    public void verifyJobSearchResultUsingDifferentDataSet
            (String jobTitle, String location, String distance,
             String salaryMin, String salaryMax, String salaryType,
             String jobType, String result) throws InterruptedException {


        Thread.sleep(6000);
        homePage.acceptCookies();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.MoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.salaryTypeDropDownLink(salaryType);
        homePage.jobTypeDropDownLink(jobType);
        homePage.findJobsButton();
        resultPage.verifytheResult(result);
    }

}
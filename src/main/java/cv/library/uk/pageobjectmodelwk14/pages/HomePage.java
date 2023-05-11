package cv.library.uk.pageobjectmodelwk14.pages;
/*main package.
create all packages and class that you created for page object model
In Pages package
1.HomePage -
  Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
  Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
  enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
  clickOnFindJobsButton().
2.ResultPage
  Locators - resultText
  Method - verifyTheResults(String expected)
test package.
create all packages and class that you created for page object model
In Testsuite package
create classe
1.JobSearchTest
Inside JobSearchTest class create following testmethods
1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
  String result).
    enter job title 'jobTitle'
    enter Location 'location'
    select distance 'distance'
	click on moreSearchOptionsLink
    enter salaryMin 'salaryMin'
    enter salaryMax 'salaryMax'
	select salaryType 'salaryType'
	select jobType 'jobType'
	click on 'Find Jobs' button
	verify the result 'result'
Data set
|jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
|Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
Create 6 More data set.*/
import com.aventstack.extentreports.Status;
import cv.library.uk.pageobjectmodelwk14.customlisteners.CustomListeners;
import cv.library.uk.pageobjectmodelwk14.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    // Generate the constructor
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //Locators - jobTitle (String jobTitle) 1
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;
    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter job title " + jobTitleField.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter job title" + jobTitle);
        sendTextToElement(jobTitleField, jobTitle);
    }

    //Locators - location (String location) 2
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement LocationField;
    public void enterLocation(String Location) {
        Reporter.log("Enter Location " + LocationField.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter LocationField" + Location);
        sendTextToElement(LocationField, Location);
    }
    //Locators - distanceDropDown (String distance)3
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    public void selectDistance(String Distance) {
        Reporter.log("Enter Distance " + distanceDropDown.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter LocationField" + Distance);
        selectByVisibleTextFromDropDown(distanceDropDown, Distance);
    }
    //Locators - moreSearchOptionsLink 4
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    public void MoreSearchOptionLink() {
        Reporter.log("Click on more Option Link " + moreSearchOptionsLink.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on moreSearchOption");
        clickOnElement(moreSearchOptionsLink);
    }
    //Locators - salaryMin (String minSalary) 5
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement enterMinSalary;
    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter Min Salary " + enterMinSalary.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter MinSalary" + minSalary);
        sendTextToElement(enterMinSalary, minSalary);
    }
    //Locators - salaryMax (String maxSalary) 6
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement enterMaxSalary;
    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter Max Salary " + enterMaxSalary.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Enter MaxSalary" + maxSalary);
        sendTextToElement(enterMaxSalary, maxSalary);
    }
    //Locators - salaryTypeDropDown (String sType) 7
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDownLink;
    public void salaryTypeDropDownLink(String Salary) {
        Reporter.log("Click on Salary TypeDropDown Link " + salaryTypeDropDownLink.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on salary type dropdown" + Salary);
        selectByVisibleTextFromDropDown(salaryTypeDropDownLink, Salary);
    }
    //Locators - jobTypeDropDown (String jobType) 8
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDownLink;
    public void jobTypeDropDownLink(String jobType) {
        Reporter.log("Click on job TypeDropDown Link " + jobTypeDropDownLink.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on job type dropdown" + jobType);
        selectByVisibleTextFromDropDown(jobTypeDropDownLink, jobType);
    }
    //Locators - findJobsBtn 9
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsButton;
    public void findJobsButton() {
        Reporter.log("Click on find Jobs Button " + findJobsButton.toString() + "<br>");
        CustomListeners.test.log(Status.PASS, "Click on find jobs Button");
        clickOnElement(findJobsButton);
    }
    //Locators -
    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    public void acceptCookies() {
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }
}

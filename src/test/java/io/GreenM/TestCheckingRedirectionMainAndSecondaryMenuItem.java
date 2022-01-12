//Checking redirection path for main and secondary menu items
package io.GreenM;

import org.junit.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


public class TestCheckingRedirectionMainAndSecondaryMenuItem extends BaseTest{
    private final static String BASE_URL = "https://greenm.io";
    @Test
    public void CheckingRedirectionPathtAboutSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'About')]")).click();
        webdriver().shouldHave(url("https://greenm.io/about/"));
    }

    @Test
    public void CheckingRedirectionPathtCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        webdriver().shouldHave(url("https://greenm.io/careers/"));
    }

    @Test
    public void CheckingRedirectionPathtHCtechdigestSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'HC Tech Digest')]")).click();
        webdriver().shouldHave(url("https://greenm.io/digest/"));
    }

    @Test
    public void CheckingRedirectionPathtContactsItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Contacts')]")).click();
        webdriver().shouldHave(url("https://greenm.io/contacts/"));
    }

    @Test
    public void CheckingRedirectionPathtDatamonstersSubItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Community')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Data Monsters')]")).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.meetup.com/ru-RU/Data-Monsters/"));
    }

    @Test
    public void CheckingRedirectionPathTableauclubSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Community')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Tableau Club')]")).click();
        webdriver().shouldHave(url("https://usergroups.tableau.com/ukraine"));
    }

    @Test
    public void CheckingRedirectionPathtBlogItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

    @Test
    public void CheckingRedirectionPathtHCdataplatformSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'HC Data Platform')]")).click();
        webdriver().shouldHave(url("https://greenm.io/the-greenm-healthcare-data-platform-framework/"));
    }

    @Test
    public void CheckingRedirectionPathtCommunityinsightsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Community Insights')]")).click();
        webdriver().shouldHave(url("https://greenm.io/community-insights-data-engineering/"));
    }

    @Test
    public void CheckingRedirectionPathtDrugdevelopmentSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Drug Development')]")).click();
        webdriver().shouldHave(url("https://greenm.io/drug-development-analytics-solutions/"));
    }

    @Test
    public void CheckingRedirectionPathtHomehealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Home Health')]")).click();
        webdriver().shouldHave(url("https://greenm.io/home-health-care-solutions/"));
    }

    @Test
    public void CheckingRedirectionPathtPatientengagementandmhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Patient Engagement and mHealth')]")).click();
        webdriver().shouldHave(url("https://greenm.io/patient-engagement-mhealth/"));
    }

    @Test
    public void CheckingRedirectionPathtPharmacymanagementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Pharmacy Management')]")).click();
        webdriver().shouldHave(url("https://greenm.io/pharmacy-management-solutions/"));
    }

    @Test
    public void CheckingRedirectionPathtPointofcareSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Point of Care')]")).click();
        webdriver().shouldHave(url("https://greenm.io/point-of-care-data-engineering/"));
    }

    @Test
    public void CheckingRedirectionPathtPopulationhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Population Health')]")).click();
        webdriver().shouldHave(url("https://greenm.io/population-health-management-solutions/"));
    }

    @Test
    public void CheckingRedirectionPathtPrecisionmedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Precision medicine')]")).click();
        webdriver().shouldHave(url("https://greenm.io/precision-medicine-analytics-solutions/"));
    }

    @Test
    public void CheckingRedirectionPathtRFIDassettrackingSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'RFID Asset Tracking')]")).click();
        webdriver().shouldHave(url("https://greenm.io/rfid-asset-management-analytics-solutions/"));
    }

    @Test
    public void CheckingRedirectionPathtTelemedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Telemedicine')]")).click();
        webdriver().shouldHave(url("https://greenm.io/telemedicine-data-engineering-services/"));
    }

    @Test
    public void CheckingRedirectionPathtHealthdataservicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Data Services')]")).click();
        webdriver().shouldHave(url("https://greenm.io/services/"));
    }

    @Test
    public void CheckingRedirectionPathtHealthanalyticsservicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Analytics Services')]")).click();
        webdriver().shouldHave(url("https://greenm.io/healthcare-analytics/"));
    }

    @Test
    public void CheckingRedirectionPathtCustomerserviceanalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Customer Service Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/customer-service-analytics/"));
    }

    @Test
    public void CheckingRedirectionPathtEmbeddedanalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Embedded Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/embedded-analytics/"));
    }

    @Test
    public void CheckingRedirectionPathtSelfserviceanalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Self-Service Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/self-service-analytics/"));
    }

    @Test
    public void CheckingRedirectionPathtDatascienceenablementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Data Science Enablement')]")).click();
        webdriver().shouldHave(url("https://greenm.io/data-prep-for-data-science/"));
    }

    @Test
    public void CheckingRedirectionPathtTabterrierSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Products')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'TabTerrier')]")).click();
        webdriver().shouldHave(url("https://greenm.io/tabterrier/"));
    }

    @Test
    public void CheckingRedirectionPathtCasestudiesItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Case studies')]")).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

    @Test
    public void CheckingRedirectionPathtCTechnologiesItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Technologies')]")).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

}

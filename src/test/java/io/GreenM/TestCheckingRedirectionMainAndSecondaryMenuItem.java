//Checking redirection path for main and secondary menu items
package io.GreenM;

import org.junit.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;


public class TestCheckingRedirectionMainAndSecondaryMenuItem extends BaseTest{
    private final static String BASE_URL = "https://greenm.io";

//  User is redirected to the page https://greenm.io/about/  when you click "company/ABOUT" subitem
    @Test
    public void CheckingRedirectionPathtAboutSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'About')]")).click();
        webdriver().shouldHave(url("https://greenm.io/about/"));
    }

//  User is redirected to the page https://greenm.io/careers/ when you click "company/CAREERS" subitem
    @Test
    public void CheckingRedirectionPathtCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        webdriver().shouldHave(url("https://greenm.io/careers/"));
    }

//  User is redirected to the page https://greenm.io/digest/ when you click "company/HC TECH DIGEST" subitem
    @Test
    public void CheckingRedirectionPathtHCtechdigestSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'HC Tech Digest')]")).click();
        webdriver().shouldHave(url("https://greenm.io/digest/"));
    }

//  User is redirected to the page https://greenm.io/contacts/ when you click "contacts" item
    @Test
    public void CheckingRedirectionPathtContactsItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Contacts')]")).click();
        webdriver().shouldHave(url("https://greenm.io/contacts/"));
    }

//  User is redirected to the site https://www.meetup.com/ru-RU/Data-Monsters/ when you when you click "community/DATA MONSTERS" subitem
    @Test
    public void CheckingRedirectionPathtDatamonstersSubItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Community')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Data Monsters')]")).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.meetup.com/ru-RU/Data-Monsters/"));
    }

//  User is redirected to the site https://usergroups.tableau.com/ukraine when you when you click "community/TABLEAU CLUB" subitem
    @Test
    public void CheckingRedirectionPathTableauclubSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Community')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Tableau Club')]")).click();
        webdriver().shouldHave(url("https://usergroups.tableau.com/ukraine"));
    }

//  User is redirected to the page https://greenm.io/blog/ when you click "blog" item
    @Test
    public void CheckingRedirectionPathtBlogItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  User is redirected to the page https://greenm.io/the-greenm-healthcare-data-platform-framework/ when you click "solutions/HC DATA PLATFORM" subitem
    @Test
    public void CheckingRedirectionPathtHCdataplatformSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'HC Data Platform')]")).click();
        webdriver().shouldHave(url("https://greenm.io/the-greenm-healthcare-data-platform-framework/"));
    }

//  User is redirected to the page https://greenm.io/community-insights-data-engineering when you click "solutions/COMMUNITY INSIGHTS" subitem
    @Test
    public void CheckingRedirectionPathtCommunityinsightsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Community Insights')]")).click();
        webdriver().shouldHave(url("https://greenm.io/community-insights-data-engineering/"));
    }

//  User is redirected to the page https://greenm.io/drug-development-analytics-solutions/ when you click "solutions/DRUG DEVELOPMENT" subitem
    @Test
    public void CheckingRedirectionPathtDrugdevelopmentSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Drug Development')]")).click();
        webdriver().shouldHave(url("https://greenm.io/drug-development-analytics-solutions/"));
    }

//  User is redirected to the page https://greenm.io/home-health-care-solutions/ when you click "solutions/HOME HEALTH" subitem
    @Test
    public void CheckingRedirectionPathtHomehealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Home Health')]")).click();
        webdriver().shouldHave(url("https://greenm.io/home-health-care-solutions/"));
    }

//  User is redirected to the page https://greenm.io/patient-engagement-mhealth/ when you click "solutions/PATIENT ENGAGEMENT AND MHEALTH" subitem
    @Test
    public void CheckingRedirectionPathtPatientengagementandmhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Patient Engagement and mHealth')]")).click();
        webdriver().shouldHave(url("https://greenm.io/patient-engagement-mhealth/"));
    }

//  User is redirected to the page https://greenm.io/pharmacy-management-solutions/ when you click "solutions/PHARMACY MANAGEMENT" subitem
    @Test
    public void CheckingRedirectionPathtPharmacymanagementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Pharmacy Management')]")).click();
        webdriver().shouldHave(url("https://greenm.io/pharmacy-management-solutions/"));
    }

//  User is redirected to the page https://greenm.io/point-of-care-data-engineering/ when you click "solutions/POINT OF CARE" subitem
    @Test
    public void CheckingRedirectionPathtPointofcareSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Point of Care')]")).click();
        webdriver().shouldHave(url("https://greenm.io/point-of-care-data-engineering/"));
    }

//  User is redirected to the page https://greenm.io/population-health-management-solutions/ when you click "solutions/POPULATION HEALTH" subitem
    @Test
    public void CheckingRedirectionPathtPopulationhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Population Health')]")).click();
        webdriver().shouldHave(url("https://greenm.io/population-health-management-solutions/"));
    }

//  User is redirected to the page https://greenm.io/precision-medicine-analytics-solutions/ when you click "solutions/PRECISION MEDICINE" subitem
    @Test
    public void CheckingRedirectionPathtPrecisionmedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Precision medicine')]")).click();
        webdriver().shouldHave(url("https://greenm.io/precision-medicine-analytics-solutions/"));
    }

//  User is redirected to the page https://greenm.io/rfid-asset-management-analytics-solutions/ when you click "solutions/RFID ASSET TRACKING" subitem
    @Test
    public void CheckingRedirectionPathtRFIDassettrackingSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'RFID Asset Tracking')]")).click();
        webdriver().shouldHave(url("https://greenm.io/rfid-asset-management-analytics-solutions/"));
    }

//  User is redirected to the page https://greenm.io/telemedicine-data-engineering-services/ when you click "solutions/TELEMEDICINE" subitem
    @Test
    public void CheckingRedirectionPathtTelemedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Telemedicine')]")).click();
        webdriver().shouldHave(url("https://greenm.io/telemedicine-data-engineering-services/"));
    }

//  User is redirected to the page https://greenm.io/services/ when you click "services/HEALTH DATA SERVICES" subitem
    @Test
    public void CheckingRedirectionPathtHealthdataservicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Data Services')]")).click();
        webdriver().shouldHave(url("https://greenm.io/services/"));
    }

//  User is redirected to the page https://greenm.io/healthcare-analytics/ when you click "services/HEALTH ANALYTICS SERVICES" subitem
    @Test
    public void CheckingRedirectionPathtHealthanalyticsservicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Analytics Services')]")).click();
        webdriver().shouldHave(url("https://greenm.io/healthcare-analytics/"));
    }

//  User is redirected to the page https://greenm.io/customer-service-analytics/ when you click "services/CUSTOMER SERVICE ANALYTICS" subitem
    @Test
    public void CheckingRedirectionPathtCustomerserviceanalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Customer Service Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/customer-service-analytics/"));
    }

//  User is redirected to the page https://greenm.io/embedded-analytics/ when you click "services/EMBEDDED ANALYTICS" subitem
    @Test
    public void CheckingRedirectionPathtEmbeddedanalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Embedded Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/embedded-analytics/"));
    }

//  User is redirected to the page https://greenm.io/self-service-analytics/ when you click "services/SELF-SERVICE ANALYTICS" subitem
    @Test
    public void CheckingRedirectionPathtSelfserviceanalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Self-Service Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/self-service-analytics/"));
    }

//  User is redirected to the page https://greenm.io/data-prep-for-data-science/ when you click "services/DATA SCIENCE ENABLEMENT" subitem
    @Test
    public void CheckingRedirectionPathtDatascienceenablementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Data Science Enablement')]")).click();
        webdriver().shouldHave(url("https://greenm.io/data-prep-for-data-science/"));
    }

//  User is redirected to the page https://greenm.io/tabterrier/ when you click "Products/TABTERRIER" subitem
    @Test
    public void CheckingRedirectionPathtTabterrierSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Products')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'TabTerrier')]")).click();
        webdriver().shouldHave(url("https://greenm.io/tabterrier/"));
    }

//  User is redirected to the page https://greenm.io/case-studies/ when you click "CASE STUDIES" item
    @Test
    public void CheckingRedirectionPathtCasestudiesItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Case studies')]")).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  User is redirected to the page https://greenm.io/technologies/ when you click "TECHNOLOGIES" item
    @Test
    public void CheckingRedirectionPathtCTechnologiesItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Technologies')]")).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

}

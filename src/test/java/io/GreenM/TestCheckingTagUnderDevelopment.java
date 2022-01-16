//Tags validation
//contain some flaky tests
package io.GreenM;


import org.junit.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class TestCheckingTagUnderDevelopment extends BaseTest {
    private final static String BASE_URL = "https://greenm.io";

//  User is redirected to the page https://greenm.io/tag/analytics when you click "Analytics" item of the "View all tags" dropdown list 
    @Test
    public void AnalyticsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/tag/analytics/"));
    }

//  User is redirected to the page https://greenm.io/tag/aws when you click "AWS" item of the "View all tags" dropdown list 
    @Test
    public void AWSTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'AWS')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/aws/"));
    }

//  User is redirected to the page https://greenm.io/tag/better-services/ when you click "Better Services" item of the "View all tags" dropdown list 
    @Test
    public void BetterServicesTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Better Services')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/better-services/"));
    }

//  User is redirected to the page https://greenm.io/tag/business/ when you click "Business" item of the "View all tags" dropdown list 
    @Test
    public void BusinessTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Business')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/business/"));
    }

//  User is redirected to the page https://greenm.io/tag/cost-effective/ when you click "Cost Effective" item of the "View all tags" dropdown list 
    @Test
    public void CostEffectiveTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Cost Effective')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/cost-effective/"));
    }

//  User is redirected to the page https://greenm.io/tag/data-engineering when you click "Data Engineering" item of the "View all tags" dropdown list 
    @Test
    public void DataEngineeringTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Data Engineering')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/data-engineering/"));
    }

//  User is redirected to the page https://greenm.io/tag/data-protection/ when you click "Data Protection" item of the "View all tags" dropdown list 
    @Test
    public void DataProtectionTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Data Protection')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/data-protection/"));
    }

//  User is redirected to the page https://greenm.io/tag/devops/ when you click "DevOps" item of the "View all tags" dropdown list
    @Test
    public void DevOpsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'DevOps')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/devops/"));
    }

//  User is redirected to the page https://greenm.io/tag/effective-operations/ when you click "Effective Operations" item of the "View all tags" dropdown list 
    @Test
    public void EffectiveOperationsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Effective Operations')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/effective-operations/"));
    }

//  User is redirected to the page https://greenm.io/tag/empower-customers/ when you click "Empower Customers" item of the "View all tags" dropdown list 
    @Test
    public void EmpowerCustomersTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Empower Customers')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/empower-customers/"));
    }

//  User is redirected to the page https://greenm.io/tag/events/ when you click "Events" item of the "View all tags" dropdown list
    @Test
    public void EventsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Events')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/events/"));
    }

//  User is redirected to the page https://greenm.io/tag/greenm/ when you click "GreenM" item of the "View all tags" dropdown list 
    @Test
    public void GreenMTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'GreenM')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/greenm/"));
    }

//  User is redirected to the page https://greenm.io/tag/new-businesses/ when you click "New Businesses" item of the "View all tags" dropdown list 
    @Test
    public void NewBusinessesTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'New Businesses')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/new-businesses/"));
    }

//  User is redirected to the page https://greenm.io/tag/news/ when you click "News" item of the "View all tags" dropdown list
    @Test
    public void NewsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'News')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/news/"));
    }

//  User is redirected to the page https://greenm.io/tag/outsource/ when you click "Outsource" item of the "View all tags" dropdown list
    @Test
    public void OutsourceTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Outsource')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/outsource/"));
    }

//  User is redirected to the page https://greenm.io/tag/quality-management/ when you click "Quality Management" item of the "View all tags" dropdown list
    @Test
    public void QualityManagementTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Quality Management')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/quality-management/"));
    }

//  User is redirected to the page https://greenm.io/tag/security/ when you click "Security" item of the "View all tags" dropdown list 
    @Test
    public void SecurityTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Security')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/security/"));
    }

//  User is redirected to the page https://greenm.io/tag/serverless/ when you click "Serverless" item of the "View all tags" dropdown list
    @Test
    public void ServerlessTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Serverless')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/serverless/"));
    }

//  User is redirected to the page https://greenm.io/tag/smart-decisions/ when you click "Smart Decisions" item of the "View all tags" dropdown list 
    @Test
    public void SmartdecisionsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Smart Decisions')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/smart-decisions/"));

    }
}

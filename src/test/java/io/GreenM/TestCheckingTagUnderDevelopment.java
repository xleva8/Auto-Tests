//Tags validation
//contain some flaky tests
package io.GreenM;


import org.junit.Test;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class TestCheckingTagUnderDevelopment extends BaseTest {
    private final static String BASE_URL = "https://greenm.io";
//    3.4.5.1
    @Test
    public void AnalyticsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Analytics')]")).click();
        webdriver().shouldHave(url("https://greenm.io/tag/analytics/"));
    }
//3.4.5.2
    @Test
    public void AWSTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'AWS')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/aws/"));
    }
//3.4.5.3
    @Test
    public void BetterServicesTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Better Services')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/better-services/"));
    }
//3.4.5.4
    @Test
    public void BusinessTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Business')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/business/"));
    }
//3.4.5.5
    @Test
    public void CostEffectiveTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Cost Effective')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/cost-effective/"));
    }
//3.4.5.6
    @Test
    public void DataEngineeringTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Data Engineering')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/data-engineering/"));
    }
//3.4.5.7
    @Test
    public void DataProtectionTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Data Protection')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/data-protection/"));
    }
//3.4.5.8
    @Test
    public void DevOpsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'DevOps')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/devops/"));
    }
//3.4.5.9
    @Test
    public void EffectiveOperationsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Effective Operations')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/effective-operations/"));
    }
//3.4.5.10
    @Test
    public void EmpowerCustomersTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Empower Customers')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/empower-customers/"));
    }
//3.4.5.11
    @Test
    public void EventsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Events')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/events/"));
    }
//3.4.5.12
    @Test
    public void GreenMTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'GreenM')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/greenm/"));
    }
//3.4.5.13
    @Test
    public void NewBusinessesTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'New Businesses')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/new-businesses/"));
    }
//3.4.5.14
    @Test
    public void NewsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'News')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/news/"));
    }
//3.4.5.15
    @Test
    public void OutsourceTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Outsource')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/outsource/"));
    }
//3.4.5.16
    @Test
    public void QualityManagementTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Quality Management')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/quality-management/"));
    }
//3.4.5.17
    @Test
    public void SecurityTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Security')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/security/"));
    }

//3.4.5.18
    @Test
    public void ServerlessTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Serverless')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/serverless/"));
    }
//3.4.5.19
    @Test
    public void SmartdecisionsTagValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).click();
        $(byXpath("//ul[@class='tags-all_list active']//a[contains(text(),'Smart Decisions')]")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/smart-decisions/"));

    }
}

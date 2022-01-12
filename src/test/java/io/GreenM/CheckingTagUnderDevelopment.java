//Tags validation
//contain some flaky tests
package io.GreenM;


import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class CheckingTagUnderDevelopment extends BaseTest {
    private final static String BASE_URL = "https://greenm.io";
//    3.4.5.1
    @Test
    public void AnalyticsTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(1) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/analytics/"));
    }
//3.4.5.2
    @Test
    public void AWSTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(2) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/aws/"));
    }
//3.4.5.3
    @Test
    public void BetterServicesTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(3) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/better-services/"));
    }
//3.4.5.4
    @Test
    public void BusinessTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(4) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/business/"));
    }
//3.4.5.5
    @Test
    public void CostEffectiveTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(5) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/cost-effective/"));
    }
//3.4.5.6
    @Test
    public void DataEngineeringTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(6) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/data-engineering/"));
    }
//3.4.5.7
    @Test
    public void DataProtectionTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(7) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/data-protection/"));
    }
//3.4.5.8
    @Test
    public void DevOpsTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(8) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/devops/"));
    }
//3.4.5.9
    @Test
    public void EffectiveOperationsTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(9) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/effective-operations/"));
    }
//3.4.5.10
    @Test
    public void EmpowerCustomersTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(10) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/empower-customers/"));
    }
//3.4.5.11
    @Test
    public void EventsTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(11) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/events/"));
    }
//3.4.5.12
    @Test
    public void GreenMTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(12) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/greenm/"));
    }
//3.4.5.13
    @Test
    public void NewBusinessesTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(13) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/new-businesses/"));
    }
//3.4.5.14
    @Test
    public void NewsTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(14) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/news/"));
    }
//3.4.5.15
    @Test
    public void OutsourceTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(15) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/outsource/"));
    }
//3.4.5.16
    @Test
    public void QualityManagementTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(16) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/quality-management/"));
    }
//3.4.5.17
    @Test
    public void SecurityTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(17) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/security/"));
    }

//3.4.5.18
    @Test
    public void ServerlessTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(18) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/serverless/"));
    }
//3.4.5.19
    @Test
    public void SmartdecisionsTagValidation() {
        open(BASE_URL);
        $(By.id("menu-item-32")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > span")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > div.tags-all > ul > li:nth-child(19) > a")).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/tag/smart-decisions/"));

    }
}

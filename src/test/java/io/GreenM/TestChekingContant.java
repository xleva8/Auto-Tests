//Cheking buttons, forms...
package io.GreenM;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class TestChekingContant extends BaseTest {
    private final static String BASE_URL = "https://greenm.io";
    @Test
    public void siteIsAvailable() {
        open(BASE_URL);
        webdriver().shouldHave(url("https://greenm.io/"));
        $(By.id("header-content-block_6087e879ac7d5")).shouldHave(text("We make health tech solutions better"));
    }

    @Test
   public void pageContainContactUsButtonInTheHeader() {
        open(BASE_URL);
        $(By.linkText("CONTACT US")).click();
        $(By.id("header-content-block_5ebbc333c1b54")).shouldHave(text("Contact Info"));
    }

    @Test
    public void MainMenuCompanyItemAboutSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'About')]")).click();
        $(By.id("header-content-block_5ebb159449612")).shouldHave(text("Global Health Data Innovation, Architecture and Design Company"));
    }

    @Test
    public void CheckingVisibleContactButtonAndContactUsFormForAboutSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'About')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'CONTACT')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78f8d2842a9")).shouldBe(visible);
    }

    @Test
    public void MainMenuCompanyItemCareersSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(By.id("header-content-block_60b7d118aa102")).shouldHave(text("Become a part of GreenM"));
    }

    @Test
    public void CheckingVisibleOpenJobButtonForCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(byXpath("//div[@class='btn-wrap-banner']//a[contains(text(),'Open jobs')]")).shouldBe(visible);
    }

    @Test
    public void CheckingRedirectPathOpenJobButtonForCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(byXpath("//div[@class='btn-wrap-banner']//a[contains(text(),'Open jobs')]")).click();
        webdriver().shouldHave(url("https://jobs.lever.co/greenm"));
    }
//3.1.8
    @Test
    public void CheckingVisibleComeWorkWithUsFormForCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(By.id("section-form-block_60b7e676aa112")).shouldBe(visible);
    }
//3.1.11
    @Test
    public void CheckingVisibleSubscribeAndLetsTalkButtonsForHCTechDigestSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'HC Tech Digest')]")).click();
        $(byXpath("//div[@class='tags-block_wrap']//a[contains(text(),'Subscribe')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
    }

    @Test
    public void MainMenuCompanyItemHCTechdigestSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'HC Tech Digest')]")).click();
        $(byXpath("//section[@class='header-content header-content_page']")).shouldHave(text("GreenM Health Tech Digest"));
    }

    @Test
    public void MainMenuContactsItemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Contacts')]")).click();
        $(By.id("header-content-block_5ebbc333c1b54")).shouldHave(text("Contact Info"));
    }
//3.2.3
    @Test
    public void CheckingVisibleContactUsFormForContactsItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Contacts')]")).click();
        $(By.id("section-form-block_5ebbc3c1c1b59")).shouldBe(visible);
    }

    @Test
    public void MainMenuBlogItemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//section[@class='header-content header-content_page']")).shouldHave(text("Blog"));

    }
//3.4.3
    @Test
    public void CheckingVisibleSubscribeAndLetsTalkButtonsForBlogItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-block_wrap']//a[contains(text(),'Subscribe')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
    }
//3.4.4
    @Test
    public void CheckingVisibleViewAllTagsButtonForBlogItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).shouldBe(visible);
    }
//to be continued...
    @Test
    public void SecondaryMenuSolutionsItemHCdataplatformSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-6303")).click();
        $(By.cssSelector("body > section.header-content.header-content_page > div > div > div > h1")).shouldHave(text("The GreenM Healthcare Data Platform Framework"));
    }
//4.1.3
    @Test
    public void CheckingVisibleSubscribeButtonForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-6303")).click();
        $(By.cssSelector("body > section.tags-block > div > div > div > div > a")).shouldBe(visible);
    }
//4.1.4
    @Test
    public void CheckingVisibleAndRedirectGetLatestNewsButtonForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-6303")).click();
        $(By.cssSelector("#section-got-block_6077469a5eb93 > div > div > div:nth-child(2) > div > a")).shouldBe(visible).click();
        webdriver().shouldHave(url("https://greenm.io/digest/"));
    }
//4.1.5
    @Test
    public void CheckingVisibleAndRedirectLearnMoreButtonForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-6303")).click();
        $(By.cssSelector("#section-got-block_6155d5029ac92 > div > div > div:nth-child(2) > div > a")).shouldBe(visible).click();
        webdriver().shouldHave(url("https://greenm.io/services/"));
    }
//4.1.6
    @Test
    public void CheckingVisibleReferencesListForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-6303")).click();
        $(By.cssSelector("#block-6aa3b9c8-4a6c-4a10-9051-bd7fba2712e6 > strong")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemCommunityinsightsSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3324")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Community Insights Data Engineering and Analytics"));
    }
//4.1.9
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3324")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div")).shouldBe(visible);
    }
//4.1.10
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3324")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
//4.1.11
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3324")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
//4.1.12
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3324")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

    @Test
    public void SecondaryMenuSolutionsItemDrugrevelopmentSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4118")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Data Analytics Solutions for Drug Discovery and Development"));
    }
//4.1.15
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4118")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
//4.1.16
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4118")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
//4.1.17
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4118")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
//4.1.18
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4118")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemHomehealthSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3538")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Home Health Analytics and Data Engineering Services"));
    }
//4.1.21
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3538")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
//4.1.22
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3538")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
//4.1.23
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3538")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
//4.1.24
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3538")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemPatientengagementandmhealthSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3422")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Patient Engagement and mHealth Solutions"));
    }

    //4.1.27
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3422")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
    //4.1.28
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3422")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.1.29
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3422")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.1.30
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3422")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemPharmacymanagementSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3791")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Pharmacy Management Analytics and Data Engineering Solutions"));
    }

    //4.1.33
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3791")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
    //4.1.34
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3791")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.1.35
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3791")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.1.36
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3791")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }


    @Test
    public void SecondaryMenuSolutionsItemPointofcareSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3055")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("POC and EHR software and data engineering services"));
    }

    //4.1.39
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3055")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
    //4.1.40
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3055")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.1.41
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3055")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.1.42
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3055")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemPopulationhealthSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3227")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Embracing Population Health Management Solutions"));
    }

    //4.1.45
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3227")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
    //4.1.46
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3227")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.1.47
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3227")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.1.48
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-3227")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemPrecisionmedicineSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4519")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Precision Medicine Data Analytics Solutions"));
    }

    //4.1.51
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4519")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
    //4.1.52
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4519")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.1.53
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4519")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.1.54
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4519")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemRFIDassettrackingSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4398")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("RFID Asset Tracking and Inventory Management Solutions"));
    }

    //4.1.57
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4398")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
    //4.1.58
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4398")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.1.59
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4398")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.1.60
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-4398")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuSolutionsItemTelemedicineSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-2458")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Telemedicine software development and data engineering services"));
    }

    //4.1.63
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-2458")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
    //4.1.64
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-2458")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.1.65
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-2458")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.1.66
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-3421")).click();
        $(By.id("menu-item-2458")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuServicesItemHealthdataservicesSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-7681")).click();
        $(By.id("header-content-block_610843f11abc0")).shouldHave(text("Health Data Services"));
    }
//4.2.3
    @Test
    public void CheckingVisibleGetInTouchAndLetsDiscussButtonsAndLetsDiscussFormForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-7681")).click();
        $(By.xpath("//*[@id=\"section-got-block_6108493f1abc6\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_610857691abde\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.id("section-form-block_6108585b1abe1")).shouldBe(visible);
    }
//4.2.4
    @Test
    public void CheckingVisibleAndRedirectFindOutMoreButtonForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-7681")).click();
        $(By.xpath("//*[@id=\"section-banner-cta-block_61084a0d1abc7\"]/div/div/div/div/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/the-greenm-healthcare-data-platform-framework/"));
    }
//4.2.5
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-7681")).click();
        $(By.xpath("//*[@id=\"section-blog-block_610858081abe0\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
//4.2.6
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-7681")).click();
        $(By.xpath("//*[@id=\"section-case-block_610857c81abdf\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

    @Test
    public void SecondaryMenuServicesItemHealthanalyticsservicesSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-2674")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Healthcare Analytics"));
    }

    //4.2.9
    @Test
    public void CheckingVisibleContactUsButtonAndLetsDiscussFormForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-2674")).click();
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
    }
    //4.2.10
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-2674")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.2.11
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-2674")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.2.12
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-2674")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

    @Test
    public void SecondaryMenuServicesItemCustomerserviceanalyticsSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1552")).click();
        $(By.id("header-content-block_5ebb1dbda5af9")).shouldHave(text("Customer Service Analytics"));
    }

    //4.2.15
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1552")).click();
        $(By.xpath("//*[@id=\"section-got-block_5e3200ecff716\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
    }
    //4.2.16
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1552")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.2.17
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1552")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.2.18
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1552")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

    @Test
    public void SecondaryMenuServicesItemEmbeddedanalyticsSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1263")).click();
        $(By.id("header-content-block_5ebb1fcd7fb50")).shouldHave(text("Embedded Analytics Solutions"));
    }

    //4.2.21
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1263")).click();
        $(By.xpath("//*[@id=\"section-got-block_5e3200ecff716\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.id("section-form-block_5e78f693cbb2b")).shouldBe(visible);
    }
    //4.2.22
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1263")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.2.23
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1263")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.2.24
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1263")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

    @Test
    public void SecondaryMenuServicesItemSelfserviceanalyticsSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1277")).click();
        $(By.id("header-content-block_5ebb22847d642")).shouldHave(text("Self-Service Analytics Solutions"));
    }

    //4.2.27
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1277")).click();
        $(By.xpath("//*[@id=\"section-got-block_5e3200ecff716\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.id("section-form-block_5e78f00d1390d")).shouldBe(visible);
    }
    //4.2.28
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1277")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.2.29
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1277")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.2.30
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1277")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

    @Test
    public void SecondaryMenuServicesItemDatascienceenablementSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1435")).click();
        $(By.id("header-content-block_5ebb1f1f4af90")).shouldHave(text("Data Preparation for Data Science Team"));
    }

    //4.2.33
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1435")).click();
        $(By.xpath("//*[@id=\"section-got-block_5e3200ecff716\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_5e320222ff71d\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.id("section-form-block_5e78f693cbb2b")).shouldBe(visible);
    }
    //4.2.34
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1435")).click();
        $(By.xpath("//*[@id=\"section-key-block_5e33052d81e9e\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }
    //4.2.35
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1435")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
    //4.2.36
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-1168")).click();
        $(By.id("menu-item-1435")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

    @Test
    public void SecondaryMenuProductsItemTabterrierSubitemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-7207")).click();
        $(By.id("menu-item-7208")).click();
        $(By.id("header-content-block_60773e1645cd6")).shouldHave(text("TabTerrier"));
    }
//4.3.3
    @Test
    public void CheckingVisible2ContactUsButtonsForTabterrierSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-7207")).click();
        $(By.id("menu-item-7208")).click();
        $(By.xpath("//*[@id=\"section-got-block_608022171b77d\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.xpath("//*[@id=\"section-got-block_60773d2845cd5\"]/div/div/div[2]/div/a")).shouldBe(visible);
    }

    @Test
    public void SecondaryMenuCasestudiesItemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-36")).click();
        $(By.id("header-content-block_5ebbc23a49d08")).shouldHave(text("Case studies"));
    }
//4.4.3
    @Test
    public void CheckingVisibleLetsTalkButtonForCaseStudiesSubitem() {
        open(BASE_URL);
        $(By.id("menu-item-36")).click();
        $(By.xpath("/html/body/section[3]/div/div/div[2]/div/a")).shouldBe(visible);
     }

    @Test
    public void SecondaryMenuTechnologiesItemValidation() {
        open(BASE_URL);
        $(By.id("menu-item-1057")).click();
        $(By.id("header-content-block_5ebb23066a7a8")).shouldHave(text("Technology stack"));
    }
//4.5.3
    @Test
    public void CheckingVisibleReadMoreButtonAndGetInTouchFormForTechnologiesItem() {
        open(BASE_URL);
        $(By.id("menu-item-1057")).click();
        $(By.xpath("//*[@id=\"section-got-block_5e3200ecff716\"]/div/div/div[2]/div/a")).shouldBe(visible);
        $(By.id("section-form-block_5e78ea6bcadc6")).shouldBe(visible);
    }
//4.5.4
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForTechnologiesItem() {
        open(BASE_URL);
        $(By.id("menu-item-1057")).click();
        $(By.xpath("//*[@id=\"section-case-block_5e3201b0ff71b\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }
//4.5.5
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForTechnologiesItem() {
        open(BASE_URL);
        $(By.id("menu-item-1057")).click();
        $(By.xpath("//*[@id=\"section-blog-block_5e3201f3ff71c\"]/div/div[3]/div/div/span/a")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }
//5.1
    @Test
    public void CheckingVisibleAndRedirectHeaderInstagramLink() {
        open(BASE_URL);
        $(By.xpath("/html/body/header/div[1]/div/div/div[3]/div/ul/li[1]/a")).shouldBe(visible).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.instagram.com/greenm.rocks/"));
    }
//5.2
    @Test
    public void CheckingVisibleAndRedirectHeaderLinkedinLink() {
        open(BASE_URL);
        $(By.xpath("/html/body/header/div[1]/div/div/div[3]/div/ul/li[2]/a")).shouldBe(visible).scrollIntoView(true).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.linkedin.com/company/greenm/"));
    }
//5.3
    @Test
    public void CheckingVisibleAndRedirectHeaderFacebookLink() {
        open(BASE_URL);
        $(By.xpath("/html/body/header/div[1]/div/div/div[3]/div/ul/li[3]/a")).shouldBe(visible).scrollIntoView(true).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.facebook.com/greenmrocks/"));
    }


}

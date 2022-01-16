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

//  The site opens and is available
    @Test
    public void siteIsAvailable() {
        open(BASE_URL);
        webdriver().shouldHave(url("https://greenm.io/"));
        $(By.id("header-content-block_6087e879ac7d5")).shouldHave(text("We make health tech solutions better"));
    }

//  Main page contains a "CONTACT US" button in the header of the site to provide feedback
    @Test
   public void pageContainContactUsButtonInTheHeader() {
        open(BASE_URL);
        $(By.linkText("CONTACT US")).click();
        $(By.id("header-content-block_5ebbc333c1b54")).shouldHave(text("Contact Info"));
    }

//   https://greenm.io/about/ page contains “Global Health Data Innovation, Architecture and Design Company“ title in the header
    @Test
    public void MainMenuCompanyItemAboutSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'About')]")).click();
        $(By.id("header-content-block_5ebb159449612")).shouldHave(text("Global Health Data Innovation, Architecture and Design Company"));
    }

//  https://greenm.io/about/ page contains a "CONTACT" button in the content and "CONTACT US" form in the footer to provide feedback
    @Test
    public void CheckingVisibleContactButtonAndContactUsFormForAboutSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'About')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'CONTACT')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78f8d2842a9")).shouldBe(visible);
    }

//  https://greenm.io/careers/ page contains “Become a part of GreenM“ title in the header
    @Test
    public void MainMenuCompanyItemCareersSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(By.id("header-content-block_60b7d118aa102")).shouldHave(text("Become a part of GreenM"));
    }

//  https://greenm.io/careers/ page contains a "OPEN JOBS" button in the content to view open vacancies of the company
    @Test
    public void CheckingVisibleOpenJobButtonForCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(byXpath("//div[@class='btn-wrap-banner']//a[contains(text(),'Open jobs')]")).shouldBe(visible);
    }

//  User is redirected to the site https://jobs.lever.co/greenm when you click "OPEN JOBS" button on the https://greenm.io/careers/ page
    @Test
    public void CheckingRedirectPathOpenJobButtonForCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(byXpath("//div[@class='btn-wrap-banner']//a[contains(text(),'Open jobs')]")).click();
        webdriver().shouldHave(url("https://jobs.lever.co/greenm"));
    }

//  https://greenm.io/careers/ page contains a "Come work with us" form in the footer to provide feedback
    @Test
    public void CheckingVisibleComeWorkWithUsFormForCareersSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Careers')]")).click();
        $(By.id("section-form-block_60b7e676aa112")).shouldBe(visible);
    }
//  https://greenm.io/digest/ page contains a "SUBSCRIBE" button in the header of the site to subscribe the company`s blog and a "LET`S TALK" button in the footer to provide feedback
    @Test
    public void CheckingVisibleSubscribeAndLetsTalkButtonsForHCTechDigestSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'HC Tech Digest')]")).click();
        $(byXpath("//div[@class='tags-block_wrap']//a[contains(text(),'Subscribe')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
    }

//  https://greenm.io/digest/ page contains “GreenM Health Tech Digest“ title in the header
    @Test
    public void MainMenuCompanyItemHCTechdigestSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Company')]")).click();
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'HC Tech Digest')]")).click();
        $(byXpath("//section[@class='header-content header-content_page']")).shouldHave(text("GreenM Health Tech Digest"));
    }

//  https://greenm.io/contacts/ page contains “Contact Info“ title in the header
    @Test
    public void MainMenuContactsItemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Contacts')]")).click();
        $(By.id("header-content-block_5ebbc333c1b54")).shouldHave(text("Contact Info"));
    }

//  https://greenm.io/contacts/ page contant contains a "CONTACT US" form to provide feedback
    @Test
    public void CheckingVisibleContactUsFormForContactsItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Contacts')]")).click();
        $(By.id("section-form-block_5ebbc3c1c1b59")).shouldBe(visible);
    }

//  https://greenm.io/blog/ page contains “Blog“ title in the header
    @Test
    public void MainMenuBlogItemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//section[@class='header-content header-content_page']")).shouldHave(text("Blog"));

    }

//  https://greenm.io/blog/ page contains a "SUBSCRIBE" button in the header of the site to subscribe the company`s blog  and "LET`S TALK" button in the footer.
    @Test
    public void CheckingVisibleSubscribeAndLetsTalkButtonsForBlogItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-block_wrap']//a[contains(text(),'Subscribe')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
    }

//  https://greenm.io/blog/ page  contains "View all tags" dropdown list of tags for navigation in the header of the site
    @Test
    public void CheckingVisibleViewAllTagsButtonForBlogItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='bar-menu-wrap']//a[contains(text(),'Blog')]")).click();
        $(byXpath("//div[@class='tags-all']//span[contains(text(),'View all tags')]")).shouldBe(visible);
    }

//  https://greenm.io/the-greenm-healthcare-data-platform-framework/ page contains “The GreenM Healthcare Data Platform Framework  “ title in the header
    @Test
    public void SecondaryMenuSolutionsItemHCdataplatformSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'HC Data Platform')]")).click();
        $(byXpath("//h1[@class='header-title']")).shouldHave(text("The GreenM Healthcare Data Platform Framework"));
    }

//  https://greenm.io/the-greenm-healthcare-data-platform-framework/ page contains a "SUBSCRIBE" button in the header of the site to subscribe the company`s blog
    @Test
    public void CheckingVisibleSubscribeButtonForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'HC Data Platform')]")).click();
        $(byXpath("//div[@class='tags-block_wrap']//a[contains(text(),'Subscribe')]")).shouldBe(visible);
    }

//  https://greenm.io/the-greenm-healthcare-data-platform-framework/ page content contains a "GET LATEST NEWS" button to get the latest fresh publications.
//  User is redirected to the page https://greenm.io/digest when you click "GET LATEST NEWS" button 
    @Test
    public void CheckingVisibleAndRedirectGetLatestNewsButtonForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'HC Data Platform')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'GET LATEST NEWS')]")).shouldBe(visible).click();
        webdriver().shouldHave(url("https://greenm.io/digest/"));
    }

//  https://greenm.io/the-greenm-healthcare-data-platform-framework/ page content contains a "LEARN MORE" button to get more information about the company`s offer.
//  User is redirected to the page https://greenm.io/services when you click "LEARN MORE" button
    @Test
    public void CheckingVisibleAndRedirectLearnMoreButtonForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'HC Data Platform')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Learn more')]")).shouldBe(visible).click();
        webdriver().shouldHave(url("https://greenm.io/services/"));
    }

//  https://greenm.io/the-greenm-healthcare-data-platform-framework/ page content contains a block of links "References"
    @Test
    public void CheckingVisibleReferencesListForHcDataPlatformSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'HC Data Platform')]")).click();
        $(byXpath("//strong[contains(text(),'References')]")).shouldBe(visible);
    }

// https://greenm.io/community-insights-data-engineering page contains “Community Insights Data Engineering and Analytics” title in the header
    @Test
    public void SecondaryMenuSolutionsItemCommunityinsightsSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Community Insights')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Community Insights Data Engineering and Analytics"));
    }

//  https://greenm.io/community-insights-data-engineering page contant contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Community Insights')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/community-insights-data-engineering page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Community Insights')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/community-insights-data-engineering page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the pagehttps://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Community Insights')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/community-insights-data-engineering page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForCommunityInsightsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Community Insights')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/drug-development-analytics-solutions/ page contains “Data Analytics Solutions for Drug Discovery and Development“ title in the header
    @Test
    public void SecondaryMenuSolutionsItemDrugrevelopmentSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Drug Development')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Data Analytics Solutions for Drug Discovery and Development"));
    }

//  https://greenm.io/drug-development-analytics-solutions/  page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Drug Development')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/drug-development-analytics-solutions/ page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Drug Development')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/drug-development-analytics-solutions/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Drug Development')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/drug-development-analytics-solutions/ page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForDrugDevelopmentSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Drug Development')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/home-health-care-solutions/ page contains “Home Health Analytics and Data Engineering Services“ title in the header
    @Test
    public void SecondaryMenuSolutionsItemHomehealthSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Home Health')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Home Health Analytics and Data Engineering Services"));
    }

//  https://greenm.io/home-health-care-solutions/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Home Health')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/home-health-care-solutions/ page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Home Health')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/home-health-care-solutions/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Home Health')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/home-health-care-solutions/ page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForHomeHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Home Health')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/patient-engagement-mhealth/ page contains “Patient Engagement and mHealth Solutions” title in the header
    @Test
    public void SecondaryMenuSolutionsItemPatientengagementandmhealthSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Patient Engagement and mHealth')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Patient Engagement and mHealth Solutions"));
    }

//  https://greenm.io/patient-engagement-mhealth/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Patient Engagement and mHealth')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/patient-engagement-mhealth/ page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Patient Engagement and mHealth')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/patient-engagement-mhealth/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog  when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Patient Engagement and mHealth')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/patient-engagement-mhealth/ page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPatientEngagementAndMhealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Patient Engagement and mHealth')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/pharmacy-management-solutions/ page contains “Pharmacy Management Analytics and Data Engineering Solutions” title in the header
    @Test
    public void SecondaryMenuSolutionsItemPharmacymanagementSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Pharmacy Management')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Pharmacy Management Analytics and Data Engineering Solutions"));
    }

//  https://greenm.io/pharmacy-management-solutions/ page  content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Pharmacy Management')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/pharmacy-management-solutions/ page  content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Pharmacy Management')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/pharmacy-management-solutions/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Pharmacy Management')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/pharmacy-management-solutions/ page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPharmacyManagementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Pharmacy Management')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/point-of-care-data-engineering/ page contains “POC and EHR software and data engineering services“ title in the header
    @Test
    public void SecondaryMenuSolutionsItemPointofcareSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Point of Care')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("POC and EHR software and data engineering services"));
    }

//  https://greenm.io/point-of-care-data-engineering/ page  content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Point of Care')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/point-of-care-data-engineering/ page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Point of Care')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/point-of-care-data-engineering/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Point of Care')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/point-of-care-data-engineering/  page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPointOfCareSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Point of Care')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/population-health-management-solutions/ page contains “Embracing Population Health Management Solutions“ title in the header
    @Test
    public void SecondaryMenuSolutionsItemPopulationhealthSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Population Health')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Embracing Population Health Management Solutions"));
    }

//  https://greenm.io/population-health-management-solutions/  page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Population Health')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/population-health-management-solutions/ page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Population Health')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/population-health-management-solutions/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Population Health')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/population-health-management-solutions/ page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPopulationHealthSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Population Health')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/precision-medicine-analytics-solutions/  page contains “Precision Medicine Data Analytics Solutions” title in the header
    @Test
    public void SecondaryMenuSolutionsItemPrecisionmedicineSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Precision medicine')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Precision Medicine Data Analytics Solutions"));
    }

//  https://greenm.io/precision-medicine-analytics-solutions/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Precision medicine')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/precision-medicine-analytics-solutions/  page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Precision medicine')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/precision-medicine-analytics-solutions/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Precision medicine')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/precision-medicine-analytics-solutions/ page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForPrecisionMedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Precision medicine')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/rfid-asset-management-analytics-solutions/ page contains “RFID Asset Tracking and Inventory Management Solutions“ title in the header
    @Test
    public void SecondaryMenuSolutionsItemRFIDassettrackingSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'RFID Asset Tracking')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("RFID Asset Tracking and Inventory Management Solutions"));
    }

//  https://greenm.io/rfid-asset-management-analytics-solutions/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'RFID Asset Tracking')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/rfid-asset-management-analytics-solutions/ page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'RFID Asset Tracking')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/rfid-asset-management-analytics-solutions/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'RFID Asset Tracking')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/rfid-asset-management-analytics-solutions/ page contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForRFIDAssetTrackingSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'RFID Asset Tracking')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/telemedicine-data-engineering-services/ page contains “Telemedicine software development and data engineering services“ title in the header
    @Test
    public void SecondaryMenuSolutionsItemTelemedicineSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Telemedicine')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Telemedicine software development and data engineering services"));
    }

//  page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Telemedicine')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/telemedicine-data-engineering-services/ page content contains a "VIEW ALL TECHNOLOGIES" button to view all technologies.
//  User is redirected to the page https://greenm.io/technologies when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Telemedicine')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/telemedicine-data-engineering-services/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Telemedicine')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/telemedicine-data-engineering-services/ page  contains "Let`s discuss" form in the footer and a "CONTACT US" button to provide feedback
    @Test
    public void CheckingVisibleLetsDiscussFormAndContactUsButtonForTelemedicineSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Solutions')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Telemedicine')]")).click();
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'contact us')]")).shouldBe(visible);
    }

//  https://greenm.io/services/ page contains “Health Data Services” title in the header
    @Test
    public void SecondaryMenuServicesItemHealthdataservicesSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Data Services')]")).click();
        $(By.id("header-content-block_610843f11abc0")).shouldHave(text("Health Data Services"));
    }

//  https://greenm.io/services/ page contains "GET IN TOUCH" and  "CONTACT US & LET`S TALK" buttons in the contant and "Let`s discuss" form in the footer of the site to provide feedback
    @Test
    public void CheckingVisibleGetInTouchAndLetsDiscussButtonsAndLetsDiscussFormForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Data Services')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'GET IN TOUCH')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'CONTACT US & LET’S TALK')]")).shouldBe(visible);
        $(By.id("section-form-block_6108585b1abe1")).shouldBe(visible);
    }

//  https://greenm.io/services/ page contant contains a "FIND OUT MORE" button to navigate to https://greenm.io/the-greenm-healthcare-data-platform-framework page
    @Test
    public void CheckingVisibleAndRedirectFindOutMoreButtonForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Data Services')]")).click();
        $(byXpath("//div[@class='btn-wrap-banner']//a[contains(text(),'FIND OUT MORE')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/the-greenm-healthcare-data-platform-framework/"));
    }

//  https://greenm.io/services/ page contant contains a "VIEW ALL POSTS" button to view the company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Data Services')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/services/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForHealthDataServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Data Services')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/healthcare-analytics/ page contain “Healthcare Analytics“ title in the header
    @Test
    public void SecondaryMenuServicesItemHealthanalyticsservicesSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Analytics Services')]")).click();
        $(By.id("header-content-block_5ebb2007ee330")).shouldHave(text("Healthcare Analytics"));
    }

//  https://greenm.io/healthcare-analytics/ page contains "CONTACT US" button in the contant and "Let`s discuss" form in the footer of the site to provide feedback
    @Test
    public void CheckingVisibleContactUsButtonAndLetsDiscussFormForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Analytics Services')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Contact Us')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
    }

//  https://greenm.io/healthcare-analytics/ page contant contains a "VIEW ALL TECHNOLOGIES" button.
//  User is redirected to the page https://greenm.io/technologies/ when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Analytics Services')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/healthcare-analytics/ page contant contains a "VIEW ALL POSTS" button to view the company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Analytics Services')]")).click();
        $(By.xpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/healthcare-analytics/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForHealthAnalyticsServicesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Health Analytics Services')]")).click();
        $(By.xpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/customer-service-analytics/ page contains “Customer Service Analytics“ title in the header
    @Test
    public void SecondaryMenuServicesItemCustomerserviceanalyticsSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Customer Service Analytics')]")).click();
        $(By.id("header-content-block_5ebb1dbda5af9")).shouldHave(text("Customer Service Analytics"));
    }

//  https://greenm.io/customer-service-analytics/ page contains "READ MORE" and  "LET`S TALK" buttons in the contant and "Let`s discuss" form in the footer of the site to provide feedback
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Customer Service Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'read more')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78f559ddb7e")).shouldBe(visible);
    }

//  https://greenm.io/customer-service-analytics/  page contant contains a "VIEW ALL TECHNOLOGIES" button.
//  User is redirected to the page https://greenm.io/technologies/ when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Customer Service Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/customer-service-analytics/ page contant contains a "VIEW ALL POSTS" button to view the company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Customer Service Analytics')]")).click();
        $(By.xpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/customer-service-analytics/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForCustomerServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Customer Service Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/embedded-analytics/ page contains “Embedded Analytics Solutions“ title in the header
    @Test
    public void SecondaryMenuServicesItemEmbeddedanalyticsSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Embedded Analytics')]")).click();
        $(By.id("header-content-block_5ebb1fcd7fb50")).shouldHave(text("Embedded Analytics Solutions"));
    }

//  https://greenm.io/embedded-analytics/ page contains "READ MORE" and  "LET`S TALK" buttons in the contant and "Looking for more answers?" form in the footer of the site to provide feedback
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Embedded Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'read more')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78f693cbb2b")).shouldBe(visible);
    }

//  https://greenm.io/embedded-analytics/ page contant contains a "VIEW ALL TECHNOLOGIES" button.
//  User is redirected to the page https://greenm.io/technologies/ when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Embedded Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/embedded-analytics/ page contant contains a "VIEW ALL POSTS" button to view the company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Embedded Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/embedded-analytics/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForEmbeddedAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Embedded Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/self-service-analytics/ page contains “Self-Service Analytics Solutions“ title in the header
    @Test
    public void SecondaryMenuServicesItemSelfserviceanalyticsSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Self-Service Analytics')]")).click();
        $(By.id("header-content-block_5ebb22847d642")).shouldHave(text("Self-Service Analytics Solutions"));
    }

//  https://greenm.io/self-service-analytics/ page contains "READ MORE" and  "LET`S TALK" buttons in the contant and "Drop us a line" form in the footer of the site to provide feedback
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Self-Service Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'read more')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78f00d1390d")).shouldBe(visible);
    }

//  https://greenm.io/self-service-analytics/ page contant contains a "VIEW ALL TECHNOLOGIES" button.
//  User is redirected to the page https://greenm.io/technologies/ when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Self-Service Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/self-service-analytics/ page contant contains a "VIEW ALL POSTS" button to view the company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Self-Service Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/self-service-analytics/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForSelfServiceAnalyticsSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Self-Service Analytics')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/data-prep-for-data-science/ page contains “Data Preparation for Data Science Team“ title in the header
    @Test
    public void SecondaryMenuServicesItemDatascienceenablementSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Data Science Enablement')]")).click();
        $(By.id("header-content-block_5ebb1f1f4af90")).shouldHave(text("Data Preparation for Data Science Team"));
    }

//  https://greenm.io/data-prep-for-data-science/ page contains "READ MORE" and  "LET`S TALK" buttons in the contant and "Let`s take action" form in the footer of the site to provide feedback
    @Test
    public void CheckingVisibleReadMoreAndLetsTalkButtonsAndLetsDiscussFormForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Data Science Enablement')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'read more')]")).shouldBe(visible);
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78f693cbb2b")).shouldBe(visible);
    }

//  https://greenm.io/data-prep-for-data-science/ page contant contains a "VIEW ALL TECHNOLOGIES" button. User is redirected to the page https://greenm.io/technologies/ when you click "VIEW ALL TECHNOLOGIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllTechnologiesButtonForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Data Science Enablement')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View All Technologies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/technologies/"));
    }

//  https://greenm.io/data-prep-for-data-science/ page contant contains a "VIEW ALL POSTS" button to view the company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Data Science Enablement')]")).click();
        $(By.xpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/data-prep-for-data-science/ page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies.
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForDataScienceEnablementSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Services')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Data Science Enablement')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/tabterrier/ page contains “TabTerrier“ title in the header of the site
    @Test
    public void SecondaryMenuProductsItemTabterrierSubitemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Products')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'TabTerrier')]")).click();
        $(By.id("header-content-block_60773e1645cd6")).shouldHave(text("TabTerrier"));
    }

//  https://greenm.io/tabterrier/ page contant contains "CONTUCT US" 2 buttons to provide feedback
    @Test
    public void CheckingVisible2ContactUsButtonsForTabterrierSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Products')]")).click();
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'TabTerrier')]")).click();
        $$(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Contact Us')]")).first().shouldBe(visible);
        $$(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Contact Us')]")).last().shouldBe(visible);
    }

//  https://greenm.io/case-studies/ page contains “Case studies“ title in the header
    @Test
    public void SecondaryMenuCasestudiesItemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Case studies')]")).click();
        $(By.id("header-content-block_5ebbc23a49d08")).shouldHave(text("Case studies"));
    }

//  https://greenm.io/case-studies/ page contains a "Let`s talk" button in the footer to provide feedback
    @Test
    public void CheckingVisibleLetsTalkButtonForCaseStudiesSubitem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Case studies')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'Let')]")).shouldBe(visible);
     }

//  https://greenm.io/technologies/ page contains “Technology stack“ title in the header
    @Test
    public void SecondaryMenuTechnologiesItemValidation() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Technologies')]")).click();
        $(By.id("header-content-block_5ebb23066a7a8")).shouldHave(text("Technology stack"));
    }

//  https://greenm.io/technologies/ page contains a "READ MORE" button in the contant and "Get in Touch" form in the footer of the site to provide feedback
    @Test
    public void CheckingVisibleReadMoreButtonAndGetInTouchFormForTechnologiesItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Technologies')]")).click();
        $(byXpath("//div[@class='btn-wrap-got']//a[contains(text(),'read more')]")).shouldBe(visible);
        $(By.id("section-form-block_5e78ea6bcadc6")).shouldBe(visible);
    }

//  https://greenm.io/technologies/  page content contains a "VIEW ALL CASE STUDIES" button to view all company`s case studies
//  User is redirected to the page https://greenm.io/case-studies when you click "VIEW ALL CASE STUDIES" button
    @Test
    public void CheckingVisibleAndRedirectViewAllCaseStudiesButtonForTechnologiesItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Technologies')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all case studies')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/case-studies/"));
    }

//  https://greenm.io/technologies/ page content contains a "VIEW ALL POSTS" button to view company`s blog.
//  User is redirected to the page https://greenm.io/blog when you click "VIEW ALL POSTS" button
    @Test
    public void CheckingVisibleAndRedirectViewAllPostsButtonForTechnologiesItem() {
        open(BASE_URL);
        $(byXpath("//div[@class='top-menu']//a[contains(text(),'Technologies')]")).click();
        $(byXpath("//div[@class='btn-wrap']//a[contains(text(),'View all posts')]")).shouldBe(visible).scrollIntoView(true).click();
        webdriver().shouldHave(url("https://greenm.io/blog/"));
    }

//  https://greenm.io/ page contain Instagram link in the header.
//  User is redirected to https://www.instagram.com/greenm.rocks/ page when you click Instagram link
    @Test
    public void CheckingVisibleAndRedirectHeaderInstagramLink() {
        open(BASE_URL);
        $(byXpath("//i[@class='fa fa-instagram']")).shouldBe(visible).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.instagram.com/greenm.rocks/"));
    }

//  https://greenm.io/ page contain Linkedin link in the header.
//  User is redirected to https://www.linkedin.com/company/greenm/ page when you click Linkedin link
    @Test
    public void CheckingVisibleAndRedirectHeaderLinkedinLink() {
        open(BASE_URL);
        $(byXpath("//i[@class='fa fa-linkedin']")).shouldBe(visible).scrollIntoView(true).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.linkedin.com/company/greenm/"));
    }

//  https://greenm.io/ page contain Facebook link in the header.
//  User is redirected to https://www.facebook.com/greenmrocks/ page when you click Facebook link
    @Test
    public void CheckingVisibleAndRedirectHeaderFacebookLink() {
        open(BASE_URL);
        $(byXpath("//i[@class='fa fa-facebook']")).shouldBe(visible).scrollIntoView(true).click();
        switchTo().window(1);
        webdriver().shouldHave(url("https://www.facebook.com/greenmrocks/"));
    }


}

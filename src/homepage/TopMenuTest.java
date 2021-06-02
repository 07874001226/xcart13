package homepage;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class TopMenuTest extends BaseTest {
    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
        //1.1 Click on the “Shipping” link
        Thread.sleep(1000);
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]"));
        //1.2 Verify the text “Shipping”
        String expectedmessage = "Shipping";
        Thread.sleep(1000);
        String actualmessage = getTextFromElement(By.partialLinkText("Shipping"));
        Assert.assertEquals("text did not match", expectedmessage, actualmessage);
    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() throws InterruptedException {
        // 2.1 Click on the “New!” link
        Thread.sleep(1000);
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[contains(text(),'New!')]"));
        Thread.sleep(1000);
        //2.2 Verify the text “New arrivals”
        String expectedMessage1 = "New arrivals";
        Thread.sleep(1000);
        String actualMessage1 = getTextFromElement(By.xpath("//h1[text()='New arrivals']"));
        Assert.assertEquals("User not Navigate to Page + ", expectedMessage1, actualMessage1);
    }

    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully() throws InterruptedException {
        //3.1 Click on the “Coming soon” link
        Thread.sleep(1000);
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]"));
        Thread.sleep(1000);
        //3.2 Verify the text “Coming soon”
        String expectedMessage1 = "Coming soon";
        Thread.sleep(1000);
        String actualMessage1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("User not Navigate to Page + ", expectedMessage1, actualMessage1);
    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {
        //4.1 Click on the “Contact us” link
        Thread.sleep(1000);
        clickOnElement(By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]"));
        Thread.sleep(1000);
        //4.2 Verify the text “Contact us”
        String expectedMessage1 = "Contact us";
        Thread.sleep(1000);
        String actualMessage1 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("User not Navigate to Page + ", expectedMessage1, actualMessage1);
    }


    @After
    public void tearUp() {
        closeBrowser();

    }

}


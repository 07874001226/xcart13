package hotdeals;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class HotDealsTest extends BaseTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    // verifySaleProductsArrangeAlphabetically()
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        //1.2 Mouse hover on the “Sale”  link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Sale']")).click();
        //1.3 Verify the text “Sale”
        String expectedMsg1 = "Sale";
        String actualMsg1 = getTextFromElement(By.xpath("//h1[text()='Sale']"));
        Assert.assertEquals(" Text did not match", expectedMsg1, actualMsg1);
        //   1.4 Mouse hover on “Sort By” and select “Name A-Z”
        Thread.sleep(1000);
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        clickOnElement(By.partialLinkText("Name A -"));
        // 1.5 Verify that the product arrange alphabetically
    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        //2.2 Mouse hover on the “Sale”  link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Sale']")).click();
        //2.3 Verify the text “Sale”
        String expectedMsg2 = "Sale";
        String actualMsg2 = getTextFromElement(By.xpath("//h1[text()='Sale']"));
        Assert.assertEquals(" Text did not match", expectedMsg2, actualMsg2);
        //2.4 Mouse hover on “Sort By” and select “Price Low-High”
        Thread.sleep(1000);
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        //2.5 Verify that the product’s price arrange Low to High
        clickOnElement(By.partialLinkText("Price Low - Hi"));

    }

    @Test
    //3 - verifySaleProductsArrangeByRates()
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        //3.2 Mouse hover on the “Sale”  link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Sale']")).click();
        //3.3 Verify the text “Sale”
        String expectedMsg3 = "Sale";
        String actualMsg3 = getTextFromElement(By.xpath("//h1[text()='Sale']"));
        Assert.assertEquals(" Text did not match", expectedMsg3, actualMsg3);
        //3.4 Mouse hover on “Sort By” and select “Rates”
        Thread.sleep(1000);
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        //3.5 Verify that the product’s arrange Rates
        clickOnElement(By.partialLinkText("Rates"));
    }

    @Test
    //4 - verifyBestSellersProductsArrangeByZToA()
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        //1.2 Mouse hover on the “Bestsellers”  link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']")).click();
        //1.3 Verify the text “Bestsellers”
        String expectedMsg4 = "Bestsellers";
        String actualMsg4 = getTextFromElement(By.xpath("//h1[text()='Bestsellers']"));
        Assert.assertEquals(" Text did not match", expectedMsg4, actualMsg4);
        //1.4 Mouse hover on “Sort By” and select “Name Z-A”
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        clickOnElement(By.partialLinkText("Name Z -"));
        //1.5 Verify that the product arrange by Z to A
    }

    @Test
    //5 - verifyBestSellersProductsPriceArrangeHighToLow()
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        //2.2 Mouse hover on the “Bestsellers” link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']")).click();
        //2.3 Verify the text “Bestsellers”
        String expectedMsg5 = "Bestsellers";
        String actualMsg5 = getTextFromElement(By.xpath("//h1[text()='Bestsellers']"));
        Assert.assertEquals(" Text did not match", expectedMsg5, actualMsg5);
        //2.4 Mouse hover on “Sort By” and select “Price High-Low”
        Thread.sleep(1000);
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        //2.5 Verify that the product’s price arrange High to Low
        clickOnElement(By.partialLinkText("Price High - Low"));

    }

    @Test
    //	6 - verifyBestSellersProductsArrangeByRates()
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));
        //3.2 Mouse hover on the “Bestsellers”  link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']")).click();
        //3.3 Verify the text “Bestsellers”
        String expectedMsg6 = "Bestsellers";
        String actualMsg6 = getTextFromElement(By.xpath("//h1[text()='Bestsellers']"));
        Assert.assertEquals(" Text did not match", expectedMsg6, actualMsg6);
        //3.4 Mouse hover on “Sort By” and select “Rates”
        Thread.sleep(1000);
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        //3.5 Verify that the product’s arrange Rates
        clickOnElement(By.partialLinkText("Rates"));
    }

    @After
    public void tearUp() {
        closeBrowser();
    }
}
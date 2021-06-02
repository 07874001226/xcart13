package shopping;

import browserTesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.Random;

public class ShoppingTest extends BaseTest {

    String baseUrl = "https://mobile.x-cart.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //1 - verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetooth Speaker()
    public void verifyThatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetoothSpeaker() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));

        //1.2 Mouse hover on the “Sale”  link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Sale']")).click();

        //1.3 Verify the text “Sale”
        String expectedMsg = "Sale";
        String actualMsg = getTextFromElement(By.xpath("//h1[text()='Sale']"));
        Assert.assertEquals(" Text did not match", expectedMsg, actualMsg);

        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        Thread.sleep(1000);
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        clickOnElement(By.partialLinkText("Name A -"));

        //1.5 Click on “Add to cart” button of the product “Cup of Mojo BluetoothSpeaker”
        Thread.sleep(1000);
        clickOnElement(By.xpath("//div[@class='product productid-16 ']//div[@class='add-to-cart-button']"));

        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedMsg2 = "Product has been added to your cart";
        String actualMsg2 = getTextFromElement(By.xpath("//li[(text()='Product has been added to your cart')]"));
        Assert.assertEquals("Text did not match", expectedMsg2, actualMsg2);

        //1.7 Click on X sign to close the message
        Thread.sleep(1000);
        clickOnElement(By.xpath("//a[@class='close']"));

        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]"));
        Thread.sleep(1000);
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        //1.9 Verify the text “Your shopping cart - 1 item”
        String expectedMsg3 = "Your shopping cart - 1 item";
        String actualMsg3 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text did not match", expectedMsg3, actualMsg3);

        //1.10 Change the Qty = 2
        Thread.sleep(1000);
        clearValue(By.xpath("//input[@id='amount16']"));
        sendTextToElement(By.xpath("//input[@id='amount16']"), "2");

        //1.11 Verify the text “Your shopping cart - 2 items”
        Thread.sleep(1000);
        String expectedMsg4 = "Your shopping cart - 2 items";
        String actualMsg4 = getTextFromElement(By.xpath("//h1[text()='Your shopping cart - 2 items']"));
        Assert.assertEquals("Text did not match", expectedMsg4, actualMsg4);

        //1.12 Verify the Subtotal $39.98
        Thread.sleep(1000);
        String expectedMsg5 = "Subtotal: $29.98";
        String actualMsg5 = getTextFromElement(By.xpath("//ul[@class='sums']//li[@class='subtotal']"));
        Assert.assertEquals("Text did not match", expectedMsg5, actualMsg5);

        //1.13 Verify the total $46.18
        Thread.sleep(1000);
        String expectedMsg6 = "$36.00";
        String actualMsg6 = getTextFromElement(By.xpath("//li[@class='total']//span[@class='surcharge-cell']"));
        Assert.assertEquals("Text did not match", expectedMsg6, actualMsg6);

        //1.14 Click on “Go to checkout” button
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[5]/button[1]"));

        //1.15 Verify the text “Log in to your account”
        Thread.sleep(1000);
        String expectedMsg7 = "Log in to your account";
        String actualMsg7 = getTextFromElement(By.xpath("//h3[contains(text(),'Log in to your account')]"));
        Assert.assertEquals("Text did not match", expectedMsg7, actualMsg7);

        //1.16 Enter Email address
        Thread.sleep(1000);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendTextToElement(By.xpath("//input[@id='email']"), "vrajeshpatel" + randomInt + "@yahoo.com");

        //1.17 Click on “Continue” Button
        clickOnElement(By.xpath("//tbody/tr[2]/td[1]/button[1]"));

        //1.18 Verify the text “Secure Checkout”
        Thread.sleep(1000);
        String expectedMsg8 = "Secure Checkout";
        String actualMsg8 = getTextFromElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]"));
        Assert.assertEquals("Text did not match", expectedMsg8, actualMsg8);

        //1.19 Fill all the mandatory fields
        Thread.sleep(1000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-firstname']"), "Vrajesh");
        Thread.sleep(1000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-lastname']"), "Patel");
        Thread.sleep(1000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-street']"), "12 Foxlees");
        Thread.sleep(1000);
        clearValue(By.xpath("//input[@id='shippingaddress-city']"));
        Thread.sleep(1000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-city']"), "London");
        Thread.sleep(1000);
        selectByValueFromDropDown(By.xpath("//select[@id='shippingaddress-country-code']"), "GB");
        Thread.sleep(1000);
        sendTextToElement(By.xpath("//input[@id='shippingaddress-custom-state']"), "London");
        Thread.sleep(1000);
        clearValue(By.xpath("//input[@id='shippingaddress-zipcode']"));
        sendTextToElement(By.xpath("//input[@id='shippingaddress-zipcode']"), "HA0 2PR");

        //1.20 Check the check box “Create an account for later use”
        Thread.sleep(1000);
        clickOnElement(By.xpath("//input[@id='create_profile']"));
        //1.21 Enter the password
        Thread.sleep(1000);
        sendTextToElement(By.xpath("//input[@id='password']"), "Abcd1234");

        //1.22 Select the Delivery Method to “Local Shipping”Use
        Thread.sleep(2000);
        mouseHover(By.xpath("//input[@id='method128']"));
        clickOnElement(By.xpath("//input[@id='method128']"));
        //1.23 Select Payment Method “COD”
        Thread.sleep(1000);
        clickOnElement(By.xpath("//input[@id='pmethod6']"));

        //1.24 Verify the total $47.22
        Thread.sleep(1000);
        String expectedMsg9 = "$37.03";
        String actualMsg9 = getTextFromElement(By.xpath("//div[@class='total clearfix']//span[@class='surcharge']"));
        Assert.assertEquals("Price did not match", expectedMsg9, actualMsg9);

        //1.25 Click on “Place Order” Button
        Thread.sleep(1000);
        clickOnElement(By.xpath("//button[@class='btn regular-button regular-main-button place-order submit']"));

        //1.26 Verify the text “Thank you for your order”
        Thread.sleep(1000);
        String expectedMsg10 = "Thank you for your order";
        String actualMsg10 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Price did not match", expectedMsg10, actualMsg10);

    }

    @Test
    //2 - verifyThatUserShouldClearShoppingCartSuccessfully()
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {

        //1.1 Mouse hover on the “Hot deals” link
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Hot deals']"));

        //1.2 Mouse hover on the “Bestsellers” link and click
        Thread.sleep(1000);
        mouseHover(By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[text()='Bestsellers']")).click();

        //1.3 Verify the text “Bestsellers”
        Thread.sleep(1000);
        String expectedMsg10 = "Bestsellers";
        String actualMsg10 = getTextFromElement(By.xpath("//h1[text()='Bestsellers']"));
        Assert.assertEquals(" Text did not match", expectedMsg10, actualMsg10);

        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        Thread.sleep(1000);
        mouseHover(By.xpath("//span[@class='sort-by-value']"));
        clickOnElement(By.partialLinkText("Name A -"));

        //1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
        Thread.sleep(2000);
        mouseHover(By.xpath("//div[@class='product productid-13 ']"));
        clickOnElement(By.xpath("//div[@class='product productid-13 ']//div[@class='add-to-cart-button']"));

        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedMsg11 = "Product has been added to your cart";
        String actualMsg11 = getTextFromElement(By.xpath("//li[(text()='Product has been added to your cart')]"));
        Assert.assertEquals("Text did not match", expectedMsg11, actualMsg11);

        //1.7 Click on X sign to close the message
        Thread.sleep(1000);
        clickOnElement(By.xpath("//a[@class='close']"));

        //1.8 Click on “Your cart” icon and Click on “View cart” button
        clickOnElement(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]"));
        Thread.sleep(1000);
        clickOnElement(By.xpath("//span[contains(text(),'View cart')]"));

        //1.9 Verify the text “Your shopping cart - 1 item”
        String expectedMsg12 = "Your shopping cart - 1 item";
        String actualMsg12 = getTextFromElement(By.xpath("//h1[@id='page-title']"));
        Assert.assertEquals("Text did not match", expectedMsg12, actualMsg12);

        //1.10 Click on “Empty your cart” link
        Thread.sleep(1000);
        clickOnElement(By.xpath("//a[contains(text(),'Empty your cart')]"));

        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        Alert alert = driver.switchTo().alert();
        String expectedText = "Are you sure you want to clear your cart?";
        String actualText = alert.getText();
        Assert.assertEquals("Message did not match", expectedText, actualText);

        //1.12 Click “Ok” on alert
        Thread.sleep(1000);
        alert(By.xpath("//a[contains(text(),'Empty your cart')]"));

        //1.13 Verify the message “Item(s) deleted from your cart”
        Thread.sleep(1000);
        String expectedMsg13 = "Item(s) deleted from your cart";
        String actualMsg13 = getTextFromElement(By.xpath("//li[text()='Item(s) deleted from your cart']"));
        Assert.assertEquals(" Text did not match", expectedMsg13, actualMsg13);
        Thread.sleep(1000);
        clickOnElement(By.xpath("//a[@class='close']"));

        //1.15 Verify the text “Your cart is empty”
        Thread.sleep(1000);
        String expectedMsg14 = "Your cart is empty";
        String actualMsg14 = getTextFromElement(By.xpath("//h1[text()='Your cart is empty']"));
        Assert.assertEquals(" Text did not match", expectedMsg14, actualMsg14);

    }

    @After
    public void tearUp() {
        closeBrowser();
    }
}

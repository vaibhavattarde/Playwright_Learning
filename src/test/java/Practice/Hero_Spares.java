package Practice;

import com.microsoft.playwright.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hero_Spares {
    Page page;
    Browser browser;
    Playwright playwright;
    BrowserContext browserContext;

    @BeforeMethod
    public void start() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        browserContext = browser.newContext();
        page.navigate("https://eshop.heromotocorp.com/spares.html");
    }

    @Test
    public void search() throws InterruptedException {
        page.hover("//span[normalize-space()='Accessories']");
        page.click("//a[text()='Helmets']");
        Thread.sleep(3000);
//        page.evaluate("() => { document.querySelector(\"//a[@class='product photo product-item-photo product-1562']\").scrollIntoView(); }");
//        Thread.sleep(5000);
        page.click("//a[@class='product photo product-item-photo product-1562']");
        page.fill("//input[@id='zipcode']", "421301");
        page.click("#zip-check");
        Thread.sleep(5000);
        page.click("//button[normalize-space()='+']");
        //Thread.sleep(3000);
        page.click("//span[text()='Add to Cart']");
       // Thread.sleep(3000);
        page.click("//span[text()='Cart']");
         Thread.sleep(3000);
        page.click("#top-cart-btn-checkout");
        Thread.sleep(3000);
        page.fill("//div[@class='control _with-tooltip']//input[@id='customer-email']","atardevaibhav0@gmail.com");
Thread.sleep(3000);
//      page.waitForSelector("//div[@id='shipping-new-address-form']/descendant::label[@for='HRK97FO']/following::div/child::input[@name='firstname']");
       page.fill("//div[@id='shipping-new-address-form']/descendant::label[@for='HRK97FO']/following::div/child::input[@name='firstname']", "Vaibhav");

//
//        page.waitForSelector("//input[@id='D7BYAJR']");
//        page.fill("//input[@id='D7BYAJR']","Attarde");
//
//        page.waitForSelector("//input[@id='G489OCS']");
//        page.fill("//input[@id='G489OCS']","Lord sumatinathbld no 605 near wayle nagar khadakpada kalyan west");
//
//        page.waitForSelector("//input[@id='RRNSVAN']");
//        page.fill("//input[@id='RRNSVAN']","Kalyan");

    }



}

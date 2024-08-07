package Practice;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class swaglabs {
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
        page.navigate("https://www.saucedemo.com/v1/");
    }

    @Test
    public void addtocart() throws InterruptedException {
        page.fill("#user-name", "standard_user");
        page.fill("#password", "secret_sauce");
        page.click("#login-button");
        Locator dropdown = page.locator("//select[@class='product_sort_container']");
        dropdown.selectOption(new SelectOption().setLabel("Price (low to high)"));
        Thread.sleep(3000);
        page.click("//div[@id='inventory_container']//a[@id='item_2_title_link']");
        Thread.sleep(3000);
        page.click("//button[text()='ADD TO CART']");
        Thread.sleep(3000);
        page.click("//*[local-name()='svg' and @data-icon='shopping-cart']");
        Thread.sleep(3000);
        page.click("//a[text()='CHECKOUT']");
        Thread.sleep(2000);
        page.fill("#first-name", "Vaibhav");
        Thread.sleep(2000);
        page.locator("#last-name").fill("Attarde");
        Thread.sleep(2000);
        page.fill("#postal-code", "421301");
        page.click("//input[@value='CONTINUE']");
    }

}

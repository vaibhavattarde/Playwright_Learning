package Playwright_Learning;

import com.microsoft.playwright.*;

public class TextBox_2method_lp {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/form");
        page.type("//input[@name='firstName']", "Vaibhav");
        page.locator("//input[@name='lastName']").fill("Attarde");
        page.type("//textarea[@name='address']", "Lord Sumatinath building flat no 605 kalyan west");
        page.type("//input[@name='email']", "attardevaibhav0@gmail.com");
        page.type("//input[@name='phone']", "9082542214");
        page.click("//input[@value='Male']");
        Thread.sleep(5000);
        page.check("//input[@value='automation_testing']");
        Thread.sleep(3000);

        // Click on the day dropdown
        page.locator("#day-select").selectOption("1");


        // Click on the month dropdown
        page.locator("[name=month]").selectOption("October");


        // Click on the year dropdown
        page.locator("#year-select").selectOption("1999");


        page.close();
        browser.close();
    }
}

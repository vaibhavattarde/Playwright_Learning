package Playwright_Learning;

import com.microsoft.playwright.*;


public class Project_demo {
    static Page page;
    static Playwright playwright;
    static Browser browser;
    static BrowserContext context;

    public static void main(String[] args) throws InterruptedException {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context = browser.newContext();
        page = context.newPage();

        page.navigate("https://ca-stg.marecrew.com/search?searchTerm=");
        page.fill("//input[@id='username']", "userlevel5");
        page.fill("//input[@id='password']", "Test1234!");
        page.click("//button[normalize-space()='Sign In']");
        Thread.sleep(5000);


        clickUsingJs("//p[text()='Allotments']");


    }

    public static void clickUsingJs(String locator) {
        page.evaluate("() => { " +
                "const element = document.evaluate(\"" + locator + "\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue; " +
                "if (element) { " +
                "element.scrollIntoView(); " +
                "element.click(); " +
                "} " +
                "}");

    }
}
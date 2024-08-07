package Playwright_Learning;

import com.microsoft.playwright.*;

public class iframe {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page= b1.newPage();
        page.navigate("https://rahulshettyacademy.com/AutomationPractice/");
        Locator element =page.frameLocator("//iframe[@id='courses-iframe']").locator("//a[contains(text(),'JOIN NOW')]");
        element.first().click();
    }
}
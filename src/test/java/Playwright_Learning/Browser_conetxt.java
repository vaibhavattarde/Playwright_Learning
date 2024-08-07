package Playwright_Learning;

import com.microsoft.playwright.*;

public class Browser_conetxt {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browser1 = browser.newContext();
        Page p1 = browser1.newPage();
        p1.navigate("https://www.amazon.in/");
        System.out.println(p1.title());

         BrowserContext browser2 =browser.newContext();
         Page p2=browser2.newPage();
         p2.navigate("https://www.flipkart.com/");
        System.out.println(p2.title());

        p1.close();
        browser1.close();

        p2.close();
        browser2.close();
    }
}

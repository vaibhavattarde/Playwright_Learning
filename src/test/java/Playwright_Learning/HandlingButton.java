package Playwright_Learning;

import com.microsoft.playwright.*;

public class HandlingButton {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/form");
        page.click("//input[@value='Male']");

        page.close();
        browser.close();
    }
}

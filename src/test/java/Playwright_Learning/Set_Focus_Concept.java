package Playwright_Learning;

import com.microsoft.playwright.*;

public class Set_Focus_Concept {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/form");
        Locator pno =page.locator("//label[@id=':r3:-label']");
        Thread.sleep(5000);
        pno.focus();
        Thread.sleep(5000);
        pno.fill("attardevaibhav0@gmail.com");
        Thread.sleep(3000);


    }
}

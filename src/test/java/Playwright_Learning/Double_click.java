package Playwright_Learning;

import com.microsoft.playwright.*;

public class Double_click {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
//        page.navigate("https://dev.automationtesting.in/table");
//        Thread.sleep(5000);
//        page.locator("//tbody/tr[1]/td[2]/button[1]//*[name()='svg']").dblclick();
//        Thread.sleep(5000);

        page.navigate("https://www.orangehrm.com/");
        Thread.sleep(5000);
        page.locator("//button[contains(@class,'btn')]").click();
        Thread.sleep(5000);
        page.close();
        browser.close();

    }
}

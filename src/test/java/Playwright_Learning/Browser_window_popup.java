package Playwright_Learning;

import com.microsoft.playwright.*;

public class Browser_window_popup {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browser1 = browser.newContext();
        Page page = browser1.newPage();
        page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Page popup = page.waitForPopup(() -> {
            page.locator("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']").click();
            System.out.println(page.title());
        });
        popup.waitForLoadState();
        System.out.println(popup.title());
        popup.close();
        page.close();
        browser.close();
    }
}

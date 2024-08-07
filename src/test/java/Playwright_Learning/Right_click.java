package Playwright_Learning;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.MouseButton;

public class Right_click {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/table");
        Thread.sleep(3000);
        page.locator("//tbody/tr[1]/td[2]/button[2]//*[name()='svg']").click(new Locator.ClickOptions().setButton(MouseButton.RIGHT));
        Thread.sleep(3000);
        page.close();
        browser.close();

    }
}

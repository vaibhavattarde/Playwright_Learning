package Playwright_Learning;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Screenshot_element {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/form");
        //FULL SCREENSHOT

//        Thread.sleep(2000);
//        page.screenshot((new Page.ScreenshotOptions().setPath(Paths.get(".snaps/img.png")).setFullPage(true)));
//        Thread.sleep(3000);

        //particular element
        Thread.sleep(5000);
        Locator element = page.locator("//input[@placeholder='First Name']");
        Thread.sleep(5000);
        element.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get(".snaps/img2.png")));
        Thread.sleep(5000);
        page.close();
        browser.close();
    }
}
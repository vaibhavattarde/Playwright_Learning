package Playwright_Learning;

import com.microsoft.playwright.*;

public class Frame {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        BrowserContext b1 = browser.newContext();
        Page page= b1.newPage();
        page.navigate("https://www.londonfreelance.org/courses/frames/");
       String heading= page.frameLocator("//frame[@name=\"main\"]").locator("h2").textContent();
        System.out.println(heading);

    }
}

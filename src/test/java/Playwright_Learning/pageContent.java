package Playwright_Learning;

import com.microsoft.playwright.*;

public class pageContent {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://www.google.com/");
        String pagecontent = page.content();
        System.out.println("The page content is " + " " + pagecontent);
        page.close();
        browser.close();


    }
}

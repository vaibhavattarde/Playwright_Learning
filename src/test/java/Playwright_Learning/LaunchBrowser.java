package Playwright_Learning;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser= playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page= browser.newPage();
            page.navigate("https://www.flipkart.com/");
            String title =page.title();
            System.out.println("The title of the page is "+ title);

            String URL =page.url();
            System.out.println("The url of the page is"+ URL);
            browser.close();
            playwright.close();


        }

    }
}

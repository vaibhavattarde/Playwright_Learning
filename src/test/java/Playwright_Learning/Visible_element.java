package Playwright_Learning;

import com.microsoft.playwright.*;

import java.util.List;

public class Visible_element {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://www.amazon.in/");
        List<String> link = page.locator("a:visible").allInnerTexts();
        for (String a : link) {
            System.out.println(a);
        }

        System.out.println("================================================");
        int image_count = page.locator("xpath=//img >>visible=true").count();
        System.out.println("The image count is" +" " +image_count);
        page.close();
        browser.close();


    }

}

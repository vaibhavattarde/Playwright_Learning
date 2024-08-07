package Playwright_Learning;

import com.microsoft.playwright.*;

import java.util.List;

public class Xpath_Learning {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
            Page page = browser.newPage();
            page.navigate("https://www.amazon.in/");
            page.locator("//input[@id=\"twotabsearchtextbox\"]").fill("Iphone 15");
            Locator listolink = page.locator("//a[contains(text(),'Amazon')]");
            List<String> listoflink2 = listolink.allTextContents();
            for (String e:listoflink2)
            {
                System.out.println(e);
            }

            System.out.println(listolink.count());
        }
    }
}

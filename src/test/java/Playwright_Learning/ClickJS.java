package Playwright_Learning;

import com.microsoft.playwright.*;

public class ClickJS {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = browser.newContext();
        Page page = context.newPage();

        page.navigate("https://demoqa.com/");
        Thread.sleep(2000);
//        page.evaluate("() => { " +
//                "const element = document.querySelector(\"a[href='/geolocation']\"); " +
//                "if (element) { " +
//                "element.click(); " +
//                "} " +
//                "}");
//
//        Thread.sleep(2000);
        //=======================================================================================
//        page.evaluate("() => { " +
//                "const element = document.querySelector(a[href='/geolocation']); " +
//                "if (element) { " +
//                "element.scrollIntoView(); " +
//                "element.click(); " +
//                "} " +
//                "}");
        //======================================================================================
        page.evaluate("() => { " +
                "const element = document.evaluate(\"//h5[text()='Elements']\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue; " +
                "if (element) { " +
                "element.click(); " +
                "} " +
                "}");
        Thread.sleep(3000);

        browser.close();
    }
}


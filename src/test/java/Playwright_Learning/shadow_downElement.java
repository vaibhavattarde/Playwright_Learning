package Playwright_Learning;

import com.microsoft.playwright.*;

public class shadow_downElement {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page= b1.newPage();

//        //PAGE -DOM-SHADOW DOM-ELEMENT
//        page.navigate("https://books-pwakit.appspot.com/");
//        page.locator("book-app[apptitle='BOOKS'] #input").fill("Testing Books");
//       String Title= page.locator("book-app[apptitle='BOOKS'] .books-desc").textContent();
//        System.out.println("The page headline is "+ Title);
//        page.close();
//        b1.close();

        //PAGE-DOM-IFRAME-SHADOW DOM -ELEMENT
        page.navigate("https://selectorshub.com/shadow-dom-in-iframe/");
        page.frameLocator("#pact").locator("#snacktime #tea").fill("Nagori Chai");
        page.frameLocator("#pact").locator("#app2 #pizza").fill("Chicken Kheema");
        page.frameLocator("#pact").locator("#concepts #training").fill("Yes It Support");
        page.frameLocator("#pact").locator("#opled #college").fill("Birla College ");
        page.frameLocator("#pact").locator("#jest #coffee").fill("noo hated most");
        page.close();
        browser.close();

    }
}

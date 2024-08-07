package Playwright_Learning;

import com.microsoft.playwright.*;

public class Locator_concept {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page p1= b1.newPage();
        p1.navigate("https://academy.naveenautomationlabs.com/");

        //singlelement
//
//        Locator button =p1.locator("text=Login");
//        button.hover();
//        button.click();

//        Locator button = p1.locator("text=Login");
//        int logincount =button.count();
//        System.out.println(logincount);
//        button.hover();
//        button.click();
//        p1.close();
//        b1.close();

        //HOW TO HANDLE MULTIPLE ELEMENT




    }
}

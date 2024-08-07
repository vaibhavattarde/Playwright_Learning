package Playwright_Learning;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Scrooling {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        //pixel
        //page.navigate("https://the-internet.herokuapp.com/");
//        page.evaluate("window.scrollBy(0,300)");
        //position
        //page.evaluate("window.scrollTo(0,300)");

        //TILL ELEMENT
        //page.evaluate("() => { document.querySelector(\"a[href='/geolocation']\").scrollIntoView(); }");

        //pixel
        page.navigate("https://eshop.heromotocorp.com/spares.html");
        //page.evaluate("window.scrollBy(0,500)");
        //position
        //page.evaluate("window.scrollTo(0,300)");

        //TILL ELEMENT
        page.evaluate("() => { document.querySelector(\"a[href='https://www.heromotocorp.com/en-in/']\").scrollIntoView(); }");



    }

}

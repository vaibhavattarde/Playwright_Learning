package Playwright_Learning;

import com.microsoft.playwright.*;

public class Keyboard_Action {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://the-internet.herokuapp.com/key_presses");
        Thread.sleep(3000);
        page.locator("#target").press("Enter");
        Thread.sleep(5000);
        page.navigate("https://dev.automationtesting.in/form");
        Thread.sleep(3000);
        page.locator("//input[@placeholder=\"First Name\"]").fill("Vaibhav");
        Thread.sleep(3000);
        page.locator("//input[@placeholder=\"First Name\"]").press("Control+A");
        Thread.sleep(3000);
        page.locator("//input[@placeholder=\"First Name\"]").press("Control+x");
        Thread.sleep(3000);
        page.locator("//input[@placeholder=\"Last Name\"]").press("Control+v");
        Thread.sleep(3000);
        page.close();
        browser.close();
    }
}

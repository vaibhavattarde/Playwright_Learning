package Playwright_Learning;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Screen_Recording_NA {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext(new Browser.NewContextOptions()
                .setRecordVideoDir(Paths.get("myvideos/"))
                .setRecordVideoSize(640,480));
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/form");
        page.type("//input[@name='firstName']", "Vaibhav");
        page.locator("//input[@name='lastName']").fill("Attarde");
        page.type("//textarea[@name='address']", "Lord Sumatinath building flat no 605 kalyan west");
        page.type("//input[@name='email']", "attardevaibhav0@gmail.com");
        page.type("//input[@name='phone']", "9082542214");
        page.click("//input[@value='Male']");
        Thread.sleep(5000);
        page.check("//input[@value='automation_testing']");
        b1.close();
        page.close();
        playwright.close();

    }
}

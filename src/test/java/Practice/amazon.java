package Practice;

import com.microsoft.playwright.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazon {
    Page page;
    Browser browser;
    Playwright playwright;
    BrowserContext browserContext;

    @BeforeMethod
    public void start() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        browserContext = browser.newContext();
        page.navigate("https://www.amazon.in/");
    }
    @Test
    public void addtocart() throws InterruptedException {
        page.fill("#twotabsearchtextbox","Puma Shoes");
        page.click("#nav-search-submit-button");
        page.click("//*[@id='deliveryRefinements']//span[text()='Get It Today']");
        Thread.sleep(3000);
    }
}

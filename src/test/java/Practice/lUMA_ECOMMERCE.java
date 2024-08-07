package Practice;

import com.microsoft.playwright.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lUMA_ECOMMERCE {
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
        page.navigate("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void compare() throws InterruptedException {
        page.hover("//span[normalize-space()='Men']");
        Thread.sleep(3000);
        page.hover("(//span[text()='Tops'])[1]");
        Thread.sleep(3000);
//        page.click("(//span[text()='Jackets'])[1]");
//        Thread.sleep(3000);



    }

}

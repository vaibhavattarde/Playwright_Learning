package Playwright_Learning;

import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Trace_inspector {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(true));
            BrowserContext context = browser.newContext();
            context.tracing().start(new Tracing.StartOptions()
                            .setScreenshots(true)
                            .setSnapshots(true));

            Page page = context.newPage();

            page.navigate("https://eshop.heromotocorp.com/spares.html");

            page.click("[placeholder=\"Search..\"]");

            page.fill("[placeholder=\"Search..\"]", "helmate");

            page.press("[placeholder=\"Search..\"]", "Enter");
            //assert page.url().equals("https://eshop.heromotocorp.com/catalogsearch/result/?q=helmate");

            page.waitForNavigation(() -> {
                page.click("text=Accessories");
            });
            //assert page.url().equals("https://eshop.heromotocorp.com/accessories-miscellaneous.html");

            page.click("text=FIREFLY GOLDEN GRAPHICS COMPLETE KIT");
            //assert page.url().equals("https://eshop.heromotocorp.com/firefly-golden-graphics-complete-kit198.html");

            page.click("[placeholder=\"Enter Pincode\"]");

            page.fill("[placeholder=\"Enter Pincode\"]", "421301");

            page.click("button:has-text(\"Check\")");

            page.waitForNavigation(() -> {
                page.click("button:has-text(\"Add to Cart\")");
            });

            page.click("text=Continue Shopping");
            //assert page.url().equals("https://eshop.heromotocorp.com/firefly-golden-graphics-complete-kit198.html");

            page.click("[placeholder=\"Enter Pincode\"]");

            context.tracing().stop(new Tracing.StopOptions()
                    .setPath(Paths.get("trace.zip")));
        }
    }
}
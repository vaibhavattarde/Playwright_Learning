package Playwright_Learning;

import com.microsoft.playwright.*;

public class Code_generate {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();

            // Open new page
            Page page = context.newPage();

            // Go to https://eshop.heromotocorp.com/spares.html
            page.navigate("https://eshop.heromotocorp.com/spares.html");

            // Click [placeholder="Search.."]
            page.click("[placeholder=\"Search..\"]");

            // Fill [placeholder="Search.."]
            page.fill("[placeholder=\"Search..\"]", "helmate");

            // Press Enter
            page.press("[placeholder=\"Search..\"]", "Enter");
            // assert page.url().equals("https://eshop.heromotocorp.com/catalogsearch/result/?q=helmate");

            // Click text=Accessories
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://eshop.heromotocorp.com/accessories-miscellaneous.html"), () ->
            page.waitForNavigation(() -> {
                page.click("text=Accessories");
            });
            // assert page.url().equals("https://eshop.heromotocorp.com/accessories-miscellaneous.html");

            // Click text=FIREFLY GOLDEN GRAPHICS COMPLETE KIT
            page.click("text=FIREFLY GOLDEN GRAPHICS COMPLETE KIT");
            // assert page.url().equals("https://eshop.heromotocorp.com/firefly-golden-graphics-complete-kit198.html");

            // Click [placeholder="Enter Pincode"]
            page.click("[placeholder=\"Enter Pincode\"]");

            // Fill [placeholder="Enter Pincode"]
            page.fill("[placeholder=\"Enter Pincode\"]", "421301");

            // Click button:has-text("Check")
            page.click("button:has-text(\"Check\")");

            // Click button:has-text("Add to Cart")
            // page.waitForNavigation(new Page.WaitForNavigationOptions().setUrl("https://eshop.heromotocorp.com/checkout/cart/"), () ->
            page.waitForNavigation(() -> {
                page.click("button:has-text(\"Add to Cart\")");
            });

            // Click text=Continue Shopping
            page.click("text=Continue Shopping");
            // assert page.url().equals("https://eshop.heromotocorp.com/firefly-golden-graphics-complete-kit198.html");

            // Click [placeholder="Enter Pincode"]
            page.click("[placeholder=\"Enter Pincode\"]");
        }
    }
}
package Playwright_Learning;

import com.microsoft.playwright.*;

public class element_text {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/text");
        //METHOD 1
         String innetrText= page.locator("h5+span").innerText();
        System.out.println("Inner text is "+ innetrText);
        //METHOD 2
        String textContent= page.locator("h5+span").textContent();
        System.out.println(" text content  is "+ textContent);
        //METHOD 3
        String innerhtml= page.locator("h5+span").innerHTML();
        System.out.println("Inner html is "+ innerhtml);
        page.close();
        browser.close();


    }
}

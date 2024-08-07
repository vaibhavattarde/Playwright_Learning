package Playwright_Learning;

import com.microsoft.playwright.*;

public class Element_attribute {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
        page.navigate("https://dev.automationtesting.in/form");

        //first method
//       String placeholdername= page.getAttribute("//input[@name=\"firstName\"]","placeholder");
//        System.out.println("Placeholder name is " + " " + placeholdername);

        //second method
         String  typeis= page.locator("//input[@value='true']").getAttribute("type");
        System.out.println("The type of the element is "+ " "+typeis);

        page.close();
        browser.close();

    }
}

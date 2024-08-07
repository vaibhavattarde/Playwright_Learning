package Playwright_Learning;

import com.microsoft.playwright.*;

public class Javascriptpopup {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.onDialog(dialog ->
        {
            String msg = dialog.message();
            System.out.println(msg);
            dialog.accept("HI This is vaibhav ");
            //dialog.dismiss();
        });
        //SIMPLE ALERT
        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
        page.locator("//button[normalize-space()='Click for JS Alert']").click();
        // Confirmation alert //ACCEPT //DISMISS
        page.locator("//button[normalize-space()='Click for JS Confirm']").click();
        Thread.sleep(3000);
        //PROMPT ALERT
        page.locator("//button[normalize-space()='Click for JS Prompt']").click();
        String result = page.textContent("#result");
        System.out.println(result);


    }
}

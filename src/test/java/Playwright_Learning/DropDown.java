package Playwright_Learning;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
//        page.navigate("https://dev.automationtesting.in/form");
//
//        page.selectOption("#day-select","1");
//        page.locator("[name=month]").selectOption("October");
//        page.locator("#year-select").selectOption("1999");

        page.navigate("https://letcode.in/dropdowns");
        Thread.sleep(5000);
//       Locator dd= page.selectOption("#fruits","3");
//         String text=page.locator("p.subtitle").textContent();
//        Thread.sleep(5000);

//        Locator dd = page.locator("#fruits");
//        dd.selectOption("3");
//        String titletext = page.locator("p.subtitle").textContent();
//        System.out.println(titletext);

        //by using label

//         Locator dd= page.locator("#fruits");
//         dd.selectOption((new SelectOption().setLabel("Apple")));
//         Thread.sleep(5000);

        //By Using Index
//         Locator dropdown= page.locator("#fruits");
//         dropdown.selectOption(new SelectOption().setIndex(3));
//         Thread.sleep(5000);

        //IF WE WANT TO SELECT MULTIPLE OPTIONS THEN
//        Locator dropdown = page.locator("#superheros");
//        dropdown.selectOption(new String[]{"am", "aq", "ta"});
//        Thread.sleep(5000);


        //SELECT LAST VALUE
//       Locator langdd= page.locator("#lang");
//       Locator option =langdd.locator("option");
//       int count= option.count();
//        System.out.println(count);
//        langdd.selectOption(new SelectOption().setIndex(count-1));
//        Thread.sleep(5000);

        //PRINT ALL THE VALUES
        Locator langdd = page.locator("#lang");
        Locator option = langdd.locator("option");
        List<String> allinnertext=option.allInnerTexts();
        for (String text:allinnertext)
        {
            System.out.println(text);
        }
        Thread.sleep(5000);

        page.close();
        browser.close();


    }

}

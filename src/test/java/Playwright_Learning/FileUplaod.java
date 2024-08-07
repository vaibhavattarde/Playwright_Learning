package Playwright_Learning;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.FilePayload;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUplaod {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext();
        Page page = b1.newPage();
       // page.navigate("https://davidwalsh.name/demo/multiple-file-upload.php");
        //only one file
//        page.setInputFiles("#filesToUpload", Paths.get("C://Users//User//Downloads//Anisha Dubey_CV-1.pdf"));
//        Thread.sleep(3000);
//        page.setInputFiles("#filesToUpload", new Path[0]);

//        page.setInputFiles("#filesToUpload",new Path[]
//                {
//                        Paths.get("C://Users//User//Downloads//Anisha Dubey_CV-1.pdf"),
//                        Paths.get("C://Users//User//Downloads//\uD83D\uDD39API Testing Notes\uD83D\uDD39 (1).pdf")
//                });
//        Thread.sleep(3000);
//        page.setInputFiles("#filesToUpload", new Path[0]);

        //DURING RUN TIME
        page.navigate("https://cgi-lib.berkeley.edu/ex/fup.html");
        Thread.sleep(3000);
        page.setInputFiles("input[name='upfile']",new FilePayload(
                "Vaibhav.txt",
                "text/plain",
                "This is text file".getBytes(StandardCharsets.UTF_8)
        ));
        Thread.sleep(3000);
        page.click("input[type='submit']");
        Thread.sleep(3000);

        page.close();
        browser.close();
    }
}

package Playwright_Learning;

import com.microsoft.playwright.*;

import java.io.File;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenRecording {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("VIDEOS")).setRecordVideoSize(1920, 1080));
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
        Thread.sleep(3000);
        System.out.println("The path is : " + " " + page.video().path());
        File latestfilename = page.video().path().toFile();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        String timestamp = df.format(new Date());
        String filename = "MyVideoFile";
        String newfilename = "./videos/" + filename + " " + timestamp + ".mp4";
        Thread.sleep(3000);
        page.close();
        Thread.sleep(3000);
        latestfilename.renameTo(new File(newfilename));
        browser.close();
    }
}

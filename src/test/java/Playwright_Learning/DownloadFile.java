package Playwright_Learning;

import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.microsoft.playwright.*;

public class DownloadFile {

    public static void main(String[] args) {
        try {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            // Create a browser context with acceptDownloads set to true
            BrowserContext context = browser.newContext(new Browser.NewContextOptions().setAcceptDownloads(true));
            Page page = context.newPage();
            page.navigate("https://chromedriver.storage.googleapis.com/index.html?path=102.0.5005.27/");

            Download download = page.waitForDownload(() -> {
                page.click("a:text('chromedriver_win32.zip')");
            });

            // Now you can access the download properties
            System.out.println(download.url());
            String path = download.path().toString();
            System.out.println(path);

            // Save the download with a specific filename
            download.saveAs(Paths.get("Vaibhav.zip"));
            System.out.println(download.suggestedFilename());//chromedriver_mac64.zip
            page.close();
            browser.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}

package definition;

import automationbase.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import utlis.UrlParameter;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AppHooks  extends Base {

    @Before
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        TimeUnit.SECONDS.sleep(3);

        driver.get(UrlParameter.SEARCH.getUrl());
        TimeUnit.SECONDS.sleep(3);
    }

    @After
    public void tearDown(Scenario scenario) {
        driver.quit();
        if (scenario.isFailed()) {

            String screenshotName = scenario.getName().replaceAll("", "");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);

        }
    }
}

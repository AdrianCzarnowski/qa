package pl.jsystems.qa.qagui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class GuiConfig {

    protected WebDriver driver;

    @BeforeAll
    public static void setUpAll() {
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.chromedriver().setup();
    }


    @BeforeEach
    public void setUp() {

        try {
            System.setProperty("webdriver.gecko.driver", Paths.get(getClass().getClassLoader()
                    .getResource("drivers/geckodriver.exe").toURI()).toFile().getAbsolutePath());

//            System.setProperty("webdriver.chrome.driver", Paths.get(getClass().getClassLoader()
//                    .getResource("drivers/chromedriver.exe").toURI()).toFile().getAbsolutePath());

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        driver = new FirefoxDriver();
//        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

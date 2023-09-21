import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class TaskTest {
    WebDriver driver;

    @Before
    public void init() {
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("browserName", "firefox");
        options.setCapability("platformName", "WINDOWS");
        options.addArguments("--headless");
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.15.11:4444/wd/hub"),options);
        } catch (MalformedURLException e) {
            System.err.println("#################Falha na conexão com o GRID#################");
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test()
    public void testeCriarTarefaSemData() {
      driver.navigate().to("https://www.google.com.br");
    }

    @Test()
    public void testeCriarTarefaSemData2() {
        driver.navigate().to("https://www.google.com.br");
    }

    @Test()
    public void testeCriarTarefaSemData3() {
        driver.navigate().to("https://www.google.com.br");
    }

    @Test()
    public void testeCriarTarefaSemData4() {
        driver.navigate().to("https://www.google.com.br");
    }



}

package runner;

import generic.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.ProductStorePage;

public class ProductStoreRunner {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", Parameters.CHROME_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Parameters.BASE_URL);
    }

    @Test
    public void productStoreTest() {
        ProductStorePage productStorePage = new ProductStorePage(driver);
        productStorePage.agregarProducto();
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

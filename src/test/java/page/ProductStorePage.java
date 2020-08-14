package page;

import base.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ProductStorePage extends PageObject {
    @FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
    private WebElement primerProducto;
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    private WebElement btnCart;

    public ProductStorePage(WebDriver driver) {
        super(driver);
    }

    public void agregarProducto() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        primerProducto.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        btnCart.click();
        assertEquals("STORE", driver.getTitle());
    }
}

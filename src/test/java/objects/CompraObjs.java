package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author SavannaDenega
 *
 */
public class CompraObjs {

    public WebElement buttonMenu(WebDriver driver) {
        String xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement buttonChekoutOolongTea(WebDriver driver) {
        String id = "wsb-button-00000000-0000-0000-0000-000451961556";
        return driver.findElement(By.id(id));
    }

    public WebElement textEmail(WebDriver driver) {
        String id = "email";
        return driver.findElement(By.id(id));
    }

    public WebElement textName(WebDriver driver) {
        String id = "name";
        return driver.findElement(By.id(id));
    }

    public WebElement textAddress(WebDriver driver) {
        String id = "address";
        return driver.findElement(By.id(id));
    }

    public WebElement comboBoxCardType(WebDriver driver) {
        String id = "card_type";
        return driver.findElement(By.id(id));
    }

    public WebElement textCardNumber(WebDriver driver) {
        String id = "card_number";
        return driver.findElement(By.id(id));
    }

    public WebElement textCardHolderName(WebDriver driver) {
        String id = "cardholder_name";
        return driver.findElement(By.id(id));
    }

    public WebElement textVerificationCode(WebDriver driver) {
        String id = "verification_code";
        return driver.findElement(By.id(id));
    }

    public WebElement buttonPlaceOrder(WebDriver driver) {
        String xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button";
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement buttonChekoutGreenTea(WebDriver driver) {
        String id = "wsb-button-00000000-0000-0000-0000-000451955160";
        return driver.findElement(By.id(id));
    }

}

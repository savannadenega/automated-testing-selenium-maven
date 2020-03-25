package testCases;

import objects.CompraObjs;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverInstance;

/**
 * @author SavannaDenega
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CompraTestCase extends WebDriverInstance {

    CompraObjs empregadoObjs = PageFactory.initElements(driver, CompraObjs.class);

    @Test
    public void task1_comprarUmOolongTea() {
        sleep(3000);
        empregadoObjs.buttonMenu(driver).click();
        sleep(3000);
        empregadoObjs.buttonChekoutOolongTea(driver).click();
        sleep(3000);
        empregadoObjs.textEmail(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.textName(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.textAddress(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.comboBoxCardType(driver).sendKeys("Visa");
        sleep(3000);
        empregadoObjs.textCardNumber(driver).sendKeys("1345678913");
        sleep(3000);
        empregadoObjs.textCardHolderName(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.textVerificationCode(driver).sendKeys("1234");
        sleep(3000);
        empregadoObjs.buttonPlaceOrder(driver).click();
    }

    @Test
    public void task2_comprarUmGreenTea() {
        sleep(3000);
        empregadoObjs.buttonMenu(driver).click();
        sleep(3000);
        empregadoObjs.buttonChekoutGreenTea(driver).click();
        sleep(3000);
        empregadoObjs.textEmail(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.textName(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.textAddress(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.comboBoxCardType(driver).sendKeys("Visa");
        sleep(3000);
        empregadoObjs.textCardNumber(driver).sendKeys("1345678913");
        sleep(3000);
        empregadoObjs.textCardHolderName(driver).sendKeys("savanna");
        sleep(3000);
        empregadoObjs.textVerificationCode(driver).sendKeys("1234");
        sleep(3000);
        empregadoObjs.buttonPlaceOrder(driver).click();
    }

}

package test;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.AviancaSteps;

public class AviancaTest {
    @Steps
    AviancaSteps aviancaSteps =new AviancaSteps();

    @BeforeMethod
    public void before() {
        SeleniumWebDriver.ChromeWebDriver("https://www.avianca.com/co/es/");
    }

    @Test
    public void test() throws Exception {
        aviancaSteps.buscarVuelo();
    }

    @AfterMethod
    public void after() {
      SeleniumWebDriver.driver.close();
    }
}

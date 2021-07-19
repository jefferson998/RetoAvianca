package pages;

import org.openqa.selenium.By;

public class AviancaSeleccionVueloPage {
    private static final By btnSegundoVuelo = By.xpath("//button[@class='select-cabin-button']");
    private static final By lblTipoDeVuelo = By.xpath("//span[@class='ff-name ff-name-branded-fare']");
    private static final By btnTipoDeVuelo = By.xpath("//button[@class='ff-price-container']");
    private static final By btnVolverPantallaPrincipal = By.xpath("//img[@alt='Avianca logo']//ancestor::a");
    private static final By btnCerrarVentanaEmergente = By.xpath("//button[@aria-label='Cerrar ventana']");
    private static final By lblTipoDeVueloIda=By.xpath("(//b[@class='fare-type'])[1]");
    private static final By lblTipoDeVueloVuelta=By.xpath("(//b[@class='fare-type'])[2]");

    public static By getBtnCerrarVentanaEmergente() {
        return btnCerrarVentanaEmergente;
    }
    public static By getBtnVolverPantallaPrincipal() {
        return btnVolverPantallaPrincipal;
    }
    public static By getBtnSegundoVuelo() {
        return btnSegundoVuelo;
    }
    public static By getLblTipoDeVuelo() {
        return lblTipoDeVuelo;
    }
    public static By getBtnTipoDeVuelo() {
        return btnTipoDeVuelo;
    }

    public static By getLblTipoDeVueloIda() {
        return lblTipoDeVueloIda;
    }

    public static By getLblTipoDeVueloVuelta() {
        return lblTipoDeVueloVuelta;
    }
}

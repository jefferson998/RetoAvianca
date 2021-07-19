package pages;

import org.openqa.selenium.By;

public class AviancaHomePage {
    private static final By btnCookies=By.xpath("//button[@name='cookies-confirm']");
    private static By btnOpcionVuelo = By.xpath("//a[contains(text(),'Solo ida')]");
    private static final By txtCampoDesdeIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbOrigen')]");
    private static final By txtCampoDesdeSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbOrigen')]");
    private static final By txtCampoHaciaIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbDestino')]");
    private static final By txtCampoHaciaSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbDestino')]");
    private static final By txtCampoPasajeroIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbPasajeros')]");
    private static final By txtCampoPasajeroSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbPasajeros')]");
    private static final By btnBuscarVuelosIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//button[contains(text(),'Buscar vuelos')]");
    private static final By btnBuscarVuelosSoloIda = By.xpath("//div[contains(@id,'ida_1')]//button[contains(text(),'Buscar vuelos')]");
    private static final By btnPasajeroAdultoIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
    private static final By btnPasajeroNiñoIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
    private static final By btnPasajeroBebeIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
    private static final By btnPasajeroAdultoSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='adults']");
    private static final By btnPasajeroNiñoSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='child']");
    private static final By btnPasajeroBebeSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@class,'controls')]//div[contains(@class,'plus') and @data-property='infant']");
    private static final By btnCiudadDesdeAeropuerto = By.xpath("//div[contains(@data-source,'origin')]//ul[@role='list']//li");
    private static final By btnCiudadHaciaAeropuerto = By.xpath("//div[contains(@data-source,'destination')]//ul[@role='list']//li");
    private static final By txtFechaOrigenIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_1')]");
    private static final By txtFechaDestinoIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbFechas_2')]");
    private static final By txtFechaDestinoSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbFechaIda_2') and @type='text']");
    private static By btnFechaCalendarioIdaYVuelta;
    private static By btnFechaCalendarioSoloIda;
    private static final By btnPasajeroIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//input[contains(@id,'pbPasajeros')]");
    private static final By btnPasajeroSoloIda = By.xpath("//div[contains(@id,'ida_1')]//input[contains(@id,'pbPasajeros')]");
    private static final By btnConfirmarPasajerosIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//button[@class='btn btn-secondary secondary close-me hidden-xs']");
    private static final By btnConfirmarPasajerosSoloIda = By.xpath("//div[contains(@id,'ida_1')]//button[@class='btn btn-secondary secondary close-me hidden-xs']");

    public static By getBtnCookies() {
        return btnCookies;
    }

    public static By getBtnConfirmarPasajerosIdaYVuelta() {
        return btnConfirmarPasajerosIdaYVuelta;
    }

    public static By getBtnConfirmarPasajerosSoloIda() {
        return btnConfirmarPasajerosSoloIda;
    }

    public static By getTxtFechaDestinoSoloIda() {
        return txtFechaDestinoSoloIda;
    }

    public static By getBtnFechaCalendarioSoloIda() {
        return btnFechaCalendarioSoloIda;
    }

    public static By getBtnPasajeroSoloIda() {
        return btnPasajeroSoloIda;
    }

    public static By getBtnPasajeroIdaYVuelta() {
        return btnPasajeroIdaYVuelta;
    }

    public static By getTxtFechaOrigenIdaYVuelta() {
        return txtFechaOrigenIdaYVuelta;
    }

    public static By getTxtFechaDestinoIdaYVuelta() {
        return txtFechaDestinoIdaYVuelta;
    }

    public static By getBtnFechaCalendarioIdaYVuelta() {
        return btnFechaCalendarioIdaYVuelta;
    }

    public static By getBtnOpcionVuelo() {
        return btnOpcionVuelo;
    }

    public static By getTxtCampoDesdeIdaYVuelta() {
        return txtCampoDesdeIdaYVuelta;
    }

    public static By getTxtCampoDesdeSoloIda() {
        return txtCampoDesdeSoloIda;
    }

    public static By getTxtCampoHaciaIdaYVuelta() {
        return txtCampoHaciaIdaYVuelta;
    }

    public static By getTxtCampoHaciaSoloIda() {
        return txtCampoHaciaSoloIda;
    }

    public static By getTxtCampoPasajeroIdaYVuelta() {
        return txtCampoPasajeroIdaYVuelta;
    }

    public static By getTxtCampoPasajeroSoloIda() {
        return txtCampoPasajeroSoloIda;
    }

    public static By getBtnBuscarVuelosIdaYVuelta() {
        return btnBuscarVuelosIdaYVuelta;
    }

    public static By getBtnBuscarVuelosSoloIda() {
        return btnBuscarVuelosSoloIda;
    }

    public static By getBtnPasajeroAdultoIdaYVuelta() {
        return btnPasajeroAdultoIdaYVuelta;
    }

    public static By getBtnPasajeroNiñoIdaYVuelta() {
        return btnPasajeroNiñoIdaYVuelta;
    }

    public static By getBtnPasajeroBebeIdaYVuelta() {
        return btnPasajeroBebeIdaYVuelta;
    }

    public static By getBtnPasajeroAdultoSoloIda() {
        return btnPasajeroAdultoSoloIda;
    }

    public static By getBtnPasajeroNiñoSoloIda() {
        return btnPasajeroNiñoSoloIda;
    }

    public static By getBtnPasajeroBebeSoloIda() {
        return btnPasajeroBebeSoloIda;
    }

    public static By getBtnCiudadDesdeAeropuerto() {
        return btnCiudadDesdeAeropuerto;
    }

    public static By getBtnCiudadHaciaAeropuerto() {
        return btnCiudadHaciaAeropuerto;
    }

    public static void setBtnOpcionVuelo(String OpcionVuelo) {
        AviancaHomePage.btnOpcionVuelo = By.xpath("//a[contains(text(),'"+OpcionVuelo+"')]");
    }

    public static void setBtnFechaCalendarioIdaYVuelta(String dia, String mes, String año) {
        AviancaHomePage.btnFechaCalendarioIdaYVuelta = By.xpath("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
        System.out.println("//div[contains(@id,'ida_regreso_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
    }

    public static void setBtnFechaCalendarioSoloIda(String dia, String mes, String año) {
        AviancaHomePage.btnFechaCalendarioSoloIda = By.xpath("//div[contains(@id,'ida_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
        System.out.println("//div[contains(@id,'ida_1')]//div[contains(@data-month,'"+año+"."+mes+"')]//div[@class='month']//div[text()='"+dia+"']");
    }
}

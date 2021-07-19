package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.AviancaHomePage;
import pages.AviancaSeleccionVueloPage;
import utils.Excel;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class AviancaSteps {
    private static ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();
    private static String defaultContent;
    private static final ArrayList<String> listaIdaYVuelta=new ArrayList<String>();
    private static final ArrayList<String> listaSoloIda=new ArrayList<String>();

    public void escribirEnTexto(By elemento, String texto) {
        boolean validarElemento = false;
        while (!validarElemento) {
            try {
                SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public void clicEnElemento(By elemento) {
        boolean validarElemento = false;
        while (!validarElemento) {
            try {
                SeleniumWebDriver.driver.findElement(elemento).click();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public String obtenerTextoDeElemento(By elemento) {
        boolean validarElemento = false;
        String textElemento = "";
        while (!validarElemento) {
            try {
                textElemento = SeleniumWebDriver.driver.findElement(elemento).getText();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
        return textElemento;
    }

    public void buscarVueloIdaYVuelta(int index) throws Exception {

        AviancaHomePage.setBtnOpcionVuelo(lecturaExcel.get(index).get("Option"));
        clicEnElemento(AviancaHomePage.getBtnOpcionVuelo());
        String message1=lecturaExcel.get(index).get("Option");
        listaIdaYVuelta.add(message1);
        clicEnElemento(AviancaHomePage.getTxtCampoDesdeIdaYVuelta());
        escribirEnTexto(AviancaHomePage.getTxtCampoDesdeIdaYVuelta(), lecturaExcel.get(index).get("Desde"));
        clicEnElemento(AviancaHomePage.getBtnCiudadDesdeAeropuerto());
        String message2=lecturaExcel.get(index).get("Desde");
        listaIdaYVuelta.add(message2);
        clicEnElemento(AviancaHomePage.getTxtCampoHaciaIdaYVuelta());
        escribirEnTexto(AviancaHomePage.getTxtCampoHaciaIdaYVuelta(), lecturaExcel.get(index).get("Hacia"));
        clicEnElemento(AviancaHomePage.getBtnCiudadHaciaAeropuerto());
        String message3=lecturaExcel.get(index).get("Hacia");
        listaIdaYVuelta.add(message3);
        clicEnElemento(AviancaHomePage.getTxtFechaOrigenIdaYVuelta());
        AviancaHomePage.setBtnFechaCalendarioIdaYVuelta(lecturaExcel.get(index).get("FechaIda").split("-")[0].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[1].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[2]);
        JavascriptExecutor jse = (JavascriptExecutor)SeleniumWebDriver.driver;
        jse.executeScript("window.scrollBy(0,500)","");
        clicEnElemento(AviancaHomePage.getBtnFechaCalendarioIdaYVuelta());
        String message4=lecturaExcel.get(index).get("FechaIda");
        listaIdaYVuelta.add(message4);
        clicEnElemento(AviancaHomePage.getTxtFechaDestinoIdaYVuelta());
        AviancaHomePage.setBtnFechaCalendarioIdaYVuelta(lecturaExcel.get(index).get("FechaVuelta").split("-")[0].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaVuelta").split("-")[1].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaVuelta").split("-")[2]);
        jse.executeScript("window.scrollBy(0,450)","");
        int size = SeleniumWebDriver.driver.findElements(By.tagName("iframe")).size();
        System.out.println("Numero de frames son: "+size);
        clicEnElemento(AviancaHomePage.getBtnFechaCalendarioIdaYVuelta());
        String message5=lecturaExcel.get(index).get("FechaVuelta");
        listaIdaYVuelta.add(message5);
        jse.executeScript("window.scrollBy(0,-450)","");
        clicEnElemento(AviancaHomePage.getBtnPasajeroIdaYVuelta());

        for (int i = 0; i < Integer.parseInt(lecturaExcel.get(index).get("Pasajero_niño")); i++) {
            clicEnElemento(AviancaHomePage.getBtnPasajeroNiñoIdaYVuelta());
        }

        for (int i = 0; i < Integer.parseInt(lecturaExcel.get(index).get("Pasajero_adulto")); i++) {
            if(Integer.parseInt(lecturaExcel.get(index).get("Pasajero_adulto"))>1) {
                clicEnElemento(AviancaHomePage.getBtnPasajeroAdultoIdaYVuelta());
            }
        }

        for (int i = 0; i < Integer.parseInt(lecturaExcel.get(index).get("Pasajero_bebe")); i++) {
            clicEnElemento(AviancaHomePage.getBtnPasajeroBebeIdaYVuelta());
        }
        clicEnElemento(AviancaHomePage.getBtnConfirmarPasajerosIdaYVuelta());
        clicEnElemento(AviancaHomePage.getBtnBuscarVuelosIdaYVuelta());
        escogerVueloIdaYVuelta();
        frameIdaYVuelta("Ida Y Vuelta",listaIdaYVuelta.get(0),listaIdaYVuelta.get(1),listaIdaYVuelta.get(2),listaIdaYVuelta.get(3),listaIdaYVuelta.get(4),listaIdaYVuelta.get(5),listaIdaYVuelta.get(6));
        clicEnElemento(AviancaSeleccionVueloPage.getBtnVolverPantallaPrincipal());
    }

    public void buscarVueloSoloIda(int index) throws Exception {
        AviancaHomePage.setBtnOpcionVuelo(lecturaExcel.get(index).get("Option"));
        clicEnElemento(AviancaHomePage.getBtnOpcionVuelo());
        String message1Ida=lecturaExcel.get(index).get("Option");
        listaSoloIda.add(message1Ida);
        clicEnElemento(AviancaHomePage.getTxtCampoDesdeSoloIda());
        escribirEnTexto(AviancaHomePage.getTxtCampoDesdeSoloIda(), lecturaExcel.get(index).get("Desde"));
        clicEnElemento(AviancaHomePage.getBtnCiudadDesdeAeropuerto());
        String message2Ida=lecturaExcel.get(index).get("Desde");
        listaSoloIda.add(message2Ida);
        clicEnElemento(AviancaHomePage.getTxtCampoHaciaSoloIda());
        escribirEnTexto(AviancaHomePage.getTxtCampoHaciaSoloIda(), lecturaExcel.get(index).get("Hacia"));
        clicEnElemento(AviancaHomePage.getBtnCiudadHaciaAeropuerto());
        String message3Ida =lecturaExcel.get(index).get("Hacia");
        listaSoloIda.add(message3Ida);
        clicEnElemento(AviancaHomePage.getTxtFechaDestinoSoloIda());
        JavascriptExecutor jse = (JavascriptExecutor)SeleniumWebDriver.driver;
        
        AviancaHomePage.setBtnFechaCalendarioSoloIda(lecturaExcel.get(index).get("FechaIda").split("-")[0].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[1].replaceAll("01", "1").replaceAll("02", "2").replaceAll("03", "3").replaceAll("04", "4").replaceAll("05", "5").replaceAll("06", "6").replaceAll("07", "7").replaceAll("08", "8").replaceAll("09", "9"), lecturaExcel.get(index).get("FechaIda").split("-")[2]);
        clicEnElemento(AviancaHomePage.getBtnFechaCalendarioSoloIda());
        String message4Ida=lecturaExcel.get(index).get("FechaIda");
        listaSoloIda.add(message4Ida);
        clicEnElemento(AviancaHomePage.getBtnPasajeroSoloIda());

        for (int i = 0; i < Integer.parseInt(lecturaExcel.get(index).get("Pasajero_niño")); i++) {
            clicEnElemento(AviancaHomePage.getBtnPasajeroNiñoSoloIda());
        }
        for (int i = 0; i < Integer.parseInt(lecturaExcel.get(index).get("Pasajero_adulto")); i++) {
            if(Integer.parseInt(lecturaExcel.get(index).get("Pasajero_adulto"))>1) {
                clicEnElemento(AviancaHomePage.getBtnPasajeroAdultoSoloIda());
            }
        }
        for (int i = 0; i < Integer.parseInt(lecturaExcel.get(index).get("Pasajero_bebe")); i++) {
            clicEnElemento(AviancaHomePage.getBtnPasajeroBebeSoloIda());
        }

        clicEnElemento(AviancaHomePage.getBtnConfirmarPasajerosSoloIda());
        clicEnElemento(AviancaHomePage.getBtnBuscarVuelosSoloIda());
        escogerSoloIda();
        frameSoloIda("Solo Ida",listaSoloIda.get(0),listaSoloIda.get(1),listaSoloIda.get(2),listaSoloIda.get(3),listaSoloIda.get(4));
        clicEnElemento(AviancaSeleccionVueloPage.getBtnVolverPantallaPrincipal());
    }

    public void buscarVuelo() throws Exception {
        clicEnElemento(AviancaHomePage.getBtnCookies());
        try {
            lecturaExcel = Excel.readExcel("C:\\Users\\pazje\\Desktop\\projectsIntelije\\RetoAvianca\\AviancaViajes.xlsx", "Informacion");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < lecturaExcel.size(); i++) {
            System.out.println(lecturaExcel.get(i).get("Option"));
            switch (lecturaExcel.get(i).get("Option")) {
                case "Ida y vuelta":
                    buscarVueloIdaYVuelta(i);
                    break;
                case "Solo ida":
                    buscarVueloSoloIda(i);
                    break;
            }
        }
    }

    public void escogerVueloIdaYVuelta() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getBtnSegundoVuelo()).get(2).click();
        Random random = new Random();
        int numeroAleatorio = random.nextInt(SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getLblTipoDeVuelo()).size());
        SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getBtnTipoDeVuelo()).get(numeroAleatorio).click();
        cerrarVentanaEmergente();
        String message6=obtenerTextoDeElemento(AviancaSeleccionVueloPage.getLblTipoDeVueloIda());
        listaIdaYVuelta.add(message6);

        SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getBtnSegundoVuelo()).get(2).click();
        Random random1 = new Random();
        int numeroAleatorio1= random1.nextInt(SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getLblTipoDeVuelo()).size());
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getBtnTipoDeVuelo()).get(numeroAleatorio1).click();
        cerrarVentanaEmergente();
        String message7=obtenerTextoDeElemento(AviancaSeleccionVueloPage.getLblTipoDeVueloVuelta());
        listaIdaYVuelta.add(message7);
    }
    public void escogerSoloIda() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getBtnSegundoVuelo()).get(2).click();

        Random random = new Random();
        int numeroAleatorio = random.nextInt(SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getLblTipoDeVuelo()).size());
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        SeleniumWebDriver.driver.findElements(AviancaSeleccionVueloPage.getBtnTipoDeVuelo()).get(numeroAleatorio).click();
        cerrarVentanaEmergente();
        String message5Ida=obtenerTextoDeElemento(AviancaSeleccionVueloPage.getLblTipoDeVueloIda());
        listaSoloIda.add(message5Ida);
    }


    public void cerrarVentanaEmergente() {
        defaultContent = SeleniumWebDriver.driver.getWindowHandle();
        Set<String> lista = SeleniumWebDriver.driver.getWindowHandles();
        Iterator<String> Il = lista.iterator();
        while(Il.hasNext()) {
            String child_windows = Il.next();
            if (!defaultContent.equals(child_windows)) {
                SeleniumWebDriver.driver.switchTo().window(child_windows);
            }
        }
        try {
            SeleniumWebDriver.driver.findElement(AviancaSeleccionVueloPage.getBtnCerrarVentanaEmergente()).click();
        } catch (Exception e) {

        }
        SeleniumWebDriver.driver.switchTo().window(defaultContent);
    }

    public static BufferedImage getScreenShot(Component component) {

        BufferedImage image = new BufferedImage(component.getWidth(), component.getHeight(), BufferedImage.TYPE_INT_RGB);
        // paints into image's Graphics
        component.paint(image.getGraphics());
        return image;
    }

    public static void getSaveSnapShot(Component component, String fileName) throws Exception {
        BufferedImage img = getScreenShot(component);
        // write the captured image as a PNG
        ImageIO.write(img, "png", new File(fileName));
    }

    public void frameIdaYVuelta(String name,String message1, String message2, String message3, String message4,String message5,String message6 ,String message7) throws Exception {
        JFrame frame = new JFrame(name);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("<html><h1>Resumen de vuelo</h1>" +
                "<ul><li>El vuelo es de tipo "+message1+"</li>" +
                "<li>El origen del vuelo es >> "+message2+"</li>" +
                "<li>El destino del vuelo es >> "+message3+"</li>" +
                "<li>La fecha de ida del vuelo es >> "+message4+"</li>" +
                "<li>La fecha de vuelta del vuelo es >> "+message5+"</li>" +
                "<li>Se selecciono la categoria  "+message6+"  del vuelo Ida</li>" +
                "<li>Se selecciono la categoria  "+message7+"  del vuelo Vuelta</li></html>");

        panel.add(label);
        frame.add(panel);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        getSaveSnapShot(panel,"IdaYVuelta.png");

    }
    public void frameSoloIda(String name,String message1, String message2, String message3, String message4,String message5 ) throws Exception {
        JFrame frame = new JFrame(name);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("<html><h1>Resumen de vuelo</h1>" +
                "<ul><li>El vuelo es de tipo "+message1+"</li>" +
                "<li>El origen del vuelo es >> "+message2+"</li>" +
                "<li>El destino del vuelo es >> "+message3+"</li>" +
                "<li>La fecha de ida del vuelo es >> "+message4+"</li>"  +
                "<li>Se selecciono la categoria  "+message5+"  del vuelo</li></html>");

        panel.add(label);
        frame.add(panel);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        getSaveSnapShot(panel,"SoloIda.png");

    }
}


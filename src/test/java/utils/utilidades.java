package utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class utilidades extends PageObject {


    public void obtenerDatosOferta() {
        int contador = 1;

        for (int i = 1; i <= contador; i++) {
            WebElementFacade elemento = findBy("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + i + "]");
            if (elemento.isClickable()) {

                WebElementFacade nombreOferta = find(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + i + "]/div/div[2]/div[1]/div/h3"));
                String nombreDeOferta = nombreOferta.getText();

                WebElementFacade fecha = find(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + i + "]/div/div[2]/div[1]/div/div/span"));
                String fechaPublicacion = fecha.getText();

                WebElementFacade desc = find(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[" + i + "]/div/div[2]/div[2]"));
                String descripcion = desc.getTextContent();

                String ANSI_BLUE = "\u001B[30m";
                String ANSI_GREEN_BACKGROUND = "\u001B[45m";
                String ANSI_RESET = "\u001B[0m";
                System.out.println(ANSI_BLUE +ANSI_GREEN_BACKGROUND +"Oferta #"+i+ "\n" +"Nombre oferta: " + nombreDeOferta + "\n" + "Fecha de publicación: " + fechaPublicacion + "\n" + "descripción de la oferta: " + descripcion + "\n"+ANSI_RESET);
                contador++;
            } else {

            }
        }
    }
}

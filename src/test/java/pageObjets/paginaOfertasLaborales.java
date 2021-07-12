package pageObjets;

import net.serenitybdd.core.pages.PageObject;
import utils.utilidades;

public class paginaOfertasLaborales extends PageObject {
    utilidades utils;


    public void verOfertasLaborales() {
        utils.obtenerDatosOferta();
    }
}




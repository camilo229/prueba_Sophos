package steps;

import net.thucydides.core.annotations.Step;
import pageObjets.paginaOfertasLaborales;
import pageObjets.paginaPrincipal;

public class stepOfertasLaborales {

    paginaPrincipal pagina;
    paginaOfertasLaborales paginaOfertas;

    @Step
    public void abrirPaginaSophos() {

        pagina.open();


    }

    @Step
    public void trabajaConNosotros() throws InterruptedException {
        pagina.ingresarTrabajaConNosotros();
        paginaOfertas.verOfertasLaborales();
    }
}

package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import pageObjets.paginaOfertasLaborales;
import pageObjets.paginaPrincipal;

public class stepOfertasLaborales {

    paginaPrincipal pagina;
    paginaOfertasLaborales paginaOfertas;

    @Step
    public void abrirPaginaSophos(WebDriver driver) {

        pagina.open();
        driver.navigate().refresh();
    }

    @Step
    public void trabajaConNosotros() throws InterruptedException {
        pagina.ingresarTrabajaConNosotros();
        paginaOfertas.verOfertasLaborales();
    }
}

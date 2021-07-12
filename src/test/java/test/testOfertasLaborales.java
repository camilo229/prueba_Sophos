package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.stepOfertasLaborales;

@RunWith(SerenityRunner.class)

public class testOfertasLaborales {


    @Steps
    stepOfertasLaborales pasos;
    @Managed
    WebDriver driver;

    @Test

    public void verOfertasLaborales() throws InterruptedException {
        pasos.abrirPaginaSophos();
        pasos.trabajaConNosotros();
    }
}

package pageObjets;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;


@DefaultUrl("https://www.sophossolutions.com/")

public class paginaPrincipal extends PageObject {

    @FindBy(xpath = "//*[@id=\"mega-menu-item-1541\"]/a")
    WebElementFacade buttonTrabajaConNostros;


    public void ingresarTrabajaConNosotros() throws InterruptedException {
        buttonTrabajaConNostros.click();
    }
}

package co.com.choucair.certification.RetoTecnicoBancolombia5.tasks;

import co.com.choucair.certification.RetoTecnicoBancolombia5.interactions.SwitchWindows;
import co.com.choucair.certification.RetoTecnicoBancolombia5.userinterface.BancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.RetoTecnicoBancolombia5.userinterface.BancolombiaPage.*;

public class SearchCondicionesGenerales implements Task {

    public static SearchCondicionesGenerales toThe() { return Tasks.instrumented(SearchCondicionesGenerales.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PRODUCTOS_BUTTON),
                Click.on(CREDITOS_BUTTON),
                Click.on(CONOCER_CREDITO_LIBRE_INVERSION_BUTTON),
                Click.on(SEGURO_VIDA_DEUDOR_BUTTON),
                Click.on(CONOCE_SEGURO_VIDA_DEUDOR_BUTTON),
                SwitchWindows.setWindow(),
                Click.on(PDF_SEGURO_VIDA_DEUDOR_LINK),
                SwitchWindows.setWindow());
    }
}

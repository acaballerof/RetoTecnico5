package co.com.choucair.certification.RetoTecnicoBancolombia5.tasks;

import co.com.choucair.certification.RetoTecnicoBancolombia5.interactions.SwitchWindows;
import co.com.choucair.certification.RetoTecnicoBancolombia5.userinterface.BancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.RetoTecnicoBancolombia5.userinterface.BancolombiaPage.*;

public class SearchInformeEconomico implements Task {
    public static SearchInformeEconomico theInfo() { return Tasks.instrumented(SearchInformeEconomico.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(EMPRESAS_BUTTON),
                Click.on(CAPITAL_INTELIGENTE_BUTTON),
                SwitchWindows.setWindow(),
                Click.on(ACTUALIDAD_ECONOMICA_BUTTON),
                Click.on(VER_MAS_BUTTON),
                Click.on(VER_MAS_BUTTON),
                Click.on(VER_MAS_BUTTON),
                Click.on(VER_MAS_BUTTON),
                Click.on(EVOLUCION_MACROECONOMICO_LINK),
                Click.on(INFORME_EVOLUCION_MACROECONOMICO_LINK),
                SwitchWindows.setWindow());
    }
}

package co.com.choucair.certification.RetoTecnicoBancolombia5.questions;

import co.com.choucair.certification.RetoTecnicoBancolombia5.model.BancolombiaData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerInformeEconomicoMensual implements Question<Boolean> {
    BancolombiaData bancolombiaData;

    public AnswerInformeEconomicoMensual(BancolombiaData bancolombiaData) {
        this.bancolombiaData = bancolombiaData;
    }

    public static AnswerInformeEconomicoMensual toThe(BancolombiaData bancolombiaData) {
        return new AnswerInformeEconomicoMensual(bancolombiaData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        if (currentUrl.contains(bancolombiaData.getUrlInformeEconomicoMensualPDF())) {
            result = true;
        }
        return result;
    }
}

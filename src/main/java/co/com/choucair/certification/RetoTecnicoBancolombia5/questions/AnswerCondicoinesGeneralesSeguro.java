package co.com.choucair.certification.RetoTecnicoBancolombia5.questions;

import co.com.choucair.certification.RetoTecnicoBancolombia5.model.BancolombiaData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class AnswerCondicoinesGeneralesSeguro implements Question<Boolean> {
    BancolombiaData bancolombiaData;

    public AnswerCondicoinesGeneralesSeguro(BancolombiaData bancolombiaData) {
        this.bancolombiaData = bancolombiaData;
    }

    public static AnswerCondicoinesGeneralesSeguro toThe(BancolombiaData bancolombiaData) {
        return new AnswerCondicoinesGeneralesSeguro(bancolombiaData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result = false;
        String currentUrl = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        if (currentUrl.contains(bancolombiaData.getUrlCondicionesGeneralesPDF())) {
            result = true;
        }
        return result;
    }
}

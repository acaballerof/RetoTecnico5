package co.com.choucair.certification.RetoTecnicoBancolombia5.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaPage {
    public static final Target EMPRESAS_BUTTON = Target.the("where the user click the empresas button")
            .located(By.id("header-empresas"));
    public static final Target CAPITAL_INTELIGENTE_BUTTON = Target.the("where the user click the capital inteligente button")
            .located(By.xpath("//div[@class='menu-inferior']//*[@id=\"menu-sup\"]/li[5]/a"));
    public static final Target ACTUALIDAD_ECONOMICA_BUTTON = Target.the("where the user click the actualidad economica button")
            .located(By.xpath("//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a"));
    public static final Target EVOLUCION_MACROECONOMICO_LINK= Target.the("where the user click the link of evolucion del contexto macroeconomico")
            .located(By.xpath("//*[@id=\"capital_inteligente\"]/div[1]/div[34]/div[2]/h2/a"));
    public static final Target INFORME_EVOLUCION_MACROECONOMICO_LINK= Target.the("where the user click the link of informe evolucion del contexto macroeconomico")
            .located(By.xpath("//*[@id=\"main-content\"]/div[2]/div[1]/div/div[1]/p[10]/a/img"));
    public static final Target VER_MAS_BUTTON= Target.the("where the user click ver mas")
            .located(By.id("verMas"));
    public static final Target PRODUCTOS_BUTTON= Target.the("where the user click in productos")
            .located(By.id("menu-productos"));
    public static final Target CREDITOS_BUTTON= Target.the("where the user click in creditos")
            .located(By.id("header-productos-creditos"));
    public static final Target CONOCER_CREDITO_LIBRE_INVERSION_BUTTON= Target.the("where the user click in creditos libre inversion")
            .located(By.xpath("//*[@id=\"creditos\"]/div/div[1]/div[1]/div/div[1]/div[2]/a"));
    public static final Target SEGURO_VIDA_DEUDOR_BUTTON= Target.the("where the user click to go to the seguro page")
            .located(By.xpath("//*[@id=\"asistencias\"]/div/div/div[2]/div[1]/div/div/a"));
    public static final Target CONOCE_SEGURO_VIDA_DEUDOR_BUTTON= Target.the("where the user click to see the seguro de vida")
            .located(By.xpath("//*[@id=\"grupo-1\"]/div/p[2]/a"));
    public static final Target PDF_SEGURO_VIDA_DEUDOR_LINK= Target.the("where the user click to see the PDF")
            .located(By.xpath("//*[@id=\"tab1\"]/table/tbody/tr/td[2]/span/a/img"));

}

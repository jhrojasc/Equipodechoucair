package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universidad Choucair")
            .located(By.xpath("//*[@id=\"universidad\"]/div[1]/a/h4/strong"));
    public static final Target INPUT_COURSE = Target.the("Busca la universidad Choucair ")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Ir a buscar el curso")
            .located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Seleccionamos el curso")
            .located(By.xpath("//a[contains(text(),'BDD - SerenityBDD + Cucumber (POM)')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//a[contains(text(),'BDD - SerenityBDD + Cucumber (POM)')]"));

}

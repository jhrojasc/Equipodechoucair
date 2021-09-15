package co.com.choucair.certification.proyectobase.Tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;

public class Login implements Task {
    private ChoucairLoginPage choucairLoginPage;
    public static Login onthePage() {
        return Tasks.instrumented(Login.class);
}

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Click.on(choucairLoginPage.LOGIN_BUTTON),
            Enter.theValue("jhrojasc").into(choucairLoginPage.INPUT_USER),
            Enter.theValue("Choucair2021*").into(choucairLoginPage.INPUT_PASSWORD),
            Click.on(choucairLoginPage.ENTER_BUTTON)
    );
    }
}

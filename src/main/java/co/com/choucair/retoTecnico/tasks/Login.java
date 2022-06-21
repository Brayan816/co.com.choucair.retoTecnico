package co.com.choucair.retoTecnico.tasks;

import co.com.choucair.retoTecnico.userinterfaces.AutomationLoginPage;
import co.com.choucair.retoTecnico.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onthePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.LOGIN_BUTTON),
                Enter.theValue("troller2599w@gmail.com").into(AutomationLoginPage.USER_INPUT),
                Enter.theValue("bsgp9905").into(AutomationLoginPage.PASS_INPUT),
                Click.on(AutomationLoginPage.ENTER_BUTTON)
        );

    }
}

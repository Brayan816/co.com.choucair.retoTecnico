package co.com.choucair.retoTecnico.userinterfaces;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final Target LOGIN_BUTTON =Target.the("Button login").located(By.xpath("//a[contains(text(),'Sign in')]"));

}

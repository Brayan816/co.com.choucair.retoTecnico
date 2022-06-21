package co.com.choucair.retoTecnico.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class AutomationLoginPage extends PageObject {

    public static final Target USER_INPUT =Target.the("User ").located(By.xpath("//input[@id='email']"));
    public static final Target PASS_INPUT =Target.the("Password").located(By.xpath("//input[@id='passwd']"));
    public static final Target ENTER_BUTTON =Target.the("Enter button").located(By.cssSelector("#SubmitLogin"));
}

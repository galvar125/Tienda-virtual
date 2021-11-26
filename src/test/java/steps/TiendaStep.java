package steps;

import net.thucydides.core.annotations.Step;
import pageobject.TiendaPageObject;

public class TiendaStep{
	
	TiendaPageObject pageobject;
	
	@Step
	public void IngresarAPaginaWeb() {
		pageobject.openUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	@Step
	public void IniciarSesion(String correo, String contra) {
		pageobject.DigitarCorreo(correo);
		pageobject.DigitarContra(contra);
		pageobject.ClicBoton();
	}
	
	@Step
	public void ValidarLogin() {
		pageobject.VerificarLogin();
	}
	
	@Step
	public void CerrarSesion() {
		pageobject.CerrarSesion();
	}

}

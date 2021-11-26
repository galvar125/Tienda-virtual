package pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TiendaPageObject extends PageObject{
	
	@FindBy(xpath = "//*[@id='email']")
	private WebElementFacade Usuario;
	
	@FindBy(xpath = "//*[@id='passwd']")
	private WebElementFacade Contrasena;
	
	@FindBy(xpath = "//*[@id='SubmitLogin']")
	private WebElementFacade BotonSignIn;
	
	@FindBy(xpath = "//a[@class='logout']")
	private WebElementFacade BotonSignOut;
	
	
	public void DigitarCorreo(String correo) {
		Usuario.sendKeys(correo);
	}
	
	public void DigitarContra(String contra) {
		Contrasena.sendKeys(contra);
	}
	
	public void ClicBoton() {
		BotonSignIn.click();
	}
	
	public void VerificarLogin() {
		if(BotonSignOut.isVisible()) {
			System.out.print("Inicio de sesion exitosa");
		}else {
			System.out.print("Usuario o contrasena no correctos");
		}
	}
	
	public void CerrarSesion() {
		BotonSignOut.click();
	}

}

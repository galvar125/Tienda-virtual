package definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.TiendaStep;

public class TiendaDefinition {
	
	@Steps
	TiendaStep step;
	
	@Given("ingresar a tienda virtual")
	public void IngresarTiendaVirtual() {
		step.IngresarAPaginaWeb();
	}
	
	@When("iniciar sesion  en la tienda con {string} y {string}")
	public void IniciarSesionCorreoYContrasena(String correo, String contra) {
	    step.IniciarSesion(correo, contra);
	}
	
	@Then("validar login exitoso")
	public void ValidarLoginExitoso() {
	    step.ValidarLogin();
	}
	
	@Then("cerrar sesion")
	public void CerrarSesion() {
	    step.CerrarSesion();
	}

}

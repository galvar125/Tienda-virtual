@tag
Feature: Tienda Virtual New Experience
	
	@InicioSesion
	Scenario Outline: Inicio de sesion
		Given ingresar a tienda virtual
		When iniciar sesion  en la tienda con "<correo>" y "<contra>"
		Then validar login exitoso
		And cerrar sesion
		
		Examples:
		| correo | contra | 
		| galvar1254@gmail.com |123456789 |
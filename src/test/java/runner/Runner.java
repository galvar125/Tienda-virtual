package runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.JUnitCore;

public class Runner{	

	@Test
	public void subrunner() {			
		JUnitCore.runClasses(TestRunner.class);		
	}

	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(features = "src/test/resources/features",tags ="@InicioSesion",glue= {"definition"})
	
	public class TestRunner{

	}

}


package stepDefinition;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.SahitestPage;
import utils.BaseClass;



public class SahiTest_Steps {
	
	SahitestPage SahiPage = new SahitestPage();
	
	
	public SahiTest_Steps() throws MalformedURLException {
    }

    @And("^Que he Ingresado al link IframeTest$")
    public void QueheIngresadoallink() throws Throwable {
    	SahiPage.LinkBack();
    	SahiPage.clickIframetest();
    }

  
    @When("^ingrese a la opcion Window open test$")
    public void ingresealaopcionWindowOpentest() throws Exception{
    	SahiPage.clickWindowopentest();
    	
    }
    
    @When("^deberia visualizar la pagina Window Open test$")
    public void deberiaingresar() throws Exception{
    	SahiPage.verificarTest();
    	SahiPage.quitDriver();
    	  
    }
    
    @When("^ingrese a la opcion Error Pages$")
    public void ingresealaopcionErrorPages() throws Exception{
    	SahiPage.clickErrorPage();
       
    }
    
    @And("^seleccione la opcion 404 page$")
    public void seleccionelaopcion404page() throws Throwable {
    	SahiPage.clickError404();
    	SahiPage.quitDriver();
    }
   
    @Then("^deberia visualizar un mensaje indicando$")
    public void deberia_visualizar_un_mensaje_indicando() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    
}
}
package stepDefinition;


import java.net.MalformedURLException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;





public class Login_Steps {
	
	LoginPage loginPage = new LoginPage();
	


	public Login_Steps() throws MalformedURLException {
    }

    @And("^he Ingresado nombre de usuario \"(.*)\" Y Password \"(.*)\"$")
    public void userEnterusernameandpassword(String username, String password) throws Throwable {
    	loginPage.setUser(username);
    	loginPage.setPassword(password);
    }

  
    @When("^de click en el boton login$")
    public void userClickOnSubmitButton() throws Exception{
    	loginPage.clickLogin();
       
    }
    
    @Then("^deberia acceder al aplicativo$")
    public void Ingresaraplicativo() throws Exception{
    	loginPage.verificarTest();
        loginPage.quitDriver();

}
}
/** ================================================================================================================
* @author  : Mariana Alzate 
* @version : 1.0 2018/08/03
* ==================================================================================================================
* 
* Clase  para la referenciacion de objetos de los Steps: Login_Steps para la ejecucion de la feature Login,
* mediante la implementaciòn de Pagefactory
* Copyright (C) 2018
===================================================================================================================
*/

package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.BaseClass;
import java.util.concurrent.TimeUnit;


public class LoginPage extends BaseClass {
	

	 /**
     * Anotacion de Pagefactory para para almacenar en caché el elemento una vez que está ubicado
     */	
@CacheLookup
	 
	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 * @param User El parámetro User define el usuario a loguear
	 */	
	@FindBy(how = How.NAME, using = "user") WebElement txtuser;
	public void setUser(String User) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		txtuser.sendKeys(User); 
    }

	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 * @param password El parámetro password define la contraseña a usar
	 */	
	@FindBy(how = How.NAME, using = "password") WebElement txtpassword;
    public void setPassword(String password) throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        txtpassword.sendKeys(password);
    }

    
    /**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 */	
    @FindBy(how = How.XPATH, using = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input") WebElement btnlogin;
    public void clickLogin() throws Exception {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        btnlogin.click();
        Log.info("Usuario Logueado ok");
         
     }
    
    public void verificarTest() throws Exception {
   
    	  String TituloPagina = driver.getTitle();
    	  System.out.println("Your page title Is : "+TituloPagina);
    	  Assert.assertEquals("Books",TituloPagina);
  
    }
}
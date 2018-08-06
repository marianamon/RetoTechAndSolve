/** ================================================================================================================
* @author  : Mariana Alzate 
* @version : 1.0 2018/08/03
* ==================================================================================================================
* 
* Clase  para la referenciacion de objetos de los Steps: Alertas_Steps para la ejecucion de la feature Generar Alertas,
* mediante la implementaciòn de Pagefactory
* Copyright (C) 2018
===================================================================================================================
*/
package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.BaseClass;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class AlertasPage extends BaseClass {
	
	
	
	 /**
     * Anotacion de Pagefactory  para almacenar en caché el elemento una vez que está ubicado
     */	
@CacheLookup
	
	

	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 */	
	@FindBy(how = How.XPATH, using = "/html/body/button") WebElement btnAllpopupthispage;
	public void clickbotonAllpopupthispage() throws Exception {
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		btnAllpopupthispage.click();   
     }


	 /**
	 * Metodo para aceptar alertas
	 */	
	public void aceptarAlerta() throws Exception {
		
	    try{
			   WebDriverWait wait = new WebDriverWait(driver, 10);
			   Alert alert = wait.until(ExpectedConditions.alertIsPresent());		  
			   alert.accept();
			   Log.info("Alerta presente y aceptada");
			   
			}catch(Throwable e){
				Log.info("catch Alert");
			}
		}
	
	 /**
	 * Metodo implementado para el paso en el que se presenta la ventana Imprimir
	 * Identificar esta ventana actual y obtener objeto boton cancelar
	 */
	public void Clickbotoncancelar() throws Exception {
		String parentWindowHandler = driver.getWindowHandle(); //Almacena la ventana actual
		String subWindowHandler = null;

		Set<String> handles = driver.getWindowHandles(); //Obteniene todas las ventana abiertas
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler); //Cambia a la ultima ventana

		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.className("cancel")).click();   //encuentra objeto indicado
		Log.info("Objeto Boton cancelar encontrado y clickeado");
		driver.switchTo().window(parentWindowHandler);  // Vuelve a la ventana principal
		}
	
	public void verificarTest() throws Exception {
		   
  	  String TituloPagina = driver.getTitle();
  	  System.out.println("Your page title Is : "+TituloPagina);
  	  Assert.assertEquals("Js Popup Test",TituloPagina);
  }
    
}

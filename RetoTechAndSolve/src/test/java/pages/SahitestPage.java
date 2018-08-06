/** ================================================================================================================
* @author  : Mariana Alzate 
* @version : 1.0 2018/08/03
* ==================================================================================================================
* 
* Clase  para la referenciacion de objetos de los Steps: SahiTest_Steps para la ejecucion de la feature
* Navegar IframeTest,mediante la implementaciòn de Pagefactory
* Copyright (C) 2018
===================================================================================================================
*/

package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import utils.BaseClass;
import java.util.concurrent.TimeUnit;


public class SahitestPage extends BaseClass {
	
	
	 /**
     * Anotacion de Pagefactory para para almacenar en caché el elemento una vez que está ubicado
     */	
@CacheLookup

	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 */	
	
	@FindBy(how = How.XPATH, using = "/html/body/a") WebElement linkback;
	public void LinkBack() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		linkback.click();
    }

	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 */	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td[1]/a[6]") WebElement linkIframetest;
    public void clickIframetest() throws Exception {
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	PageFactory.initElements(driver, this);
    	linkIframetest.click();
	    
    }
    
    /**
	 * Metodo para inicializar objeto, cambiar a Iframe donde se ubica el objeto y ejercer accion sobre el
	 */	
    @FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td[1]/a[8]") WebElement linkWinopenTest;
    public void clickWindowopentest() throws Exception {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	PageFactory.initElements(driver, this);
    	driver.switchTo (). frame (0);
    	Log.info("Cambio de Iframe ok");
    	linkWinopenTest.click();
    }
    
    /**
	 * Metodo para inicializar objeto,cambiar a Iframe donde se ubica el objeto y ejercer accion sobre el
	 */	
    @FindBy(how = How.LINK_TEXT, using = "Error Pages") WebElement linkWErrorPages;
    public void clickErrorPage() throws Exception {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	PageFactory.initElements(driver, this);
    	driver.switchTo (). frame (0); 
    	Log.info("Cambio de Iframe ok");
    	linkWErrorPages.click();
    	
    	//driver.findElement(By.xpath("/html/body/a[1]")).click();
    }
    
    
    /**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 */	
    public void clickError404() throws Exception {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	//driver.switchTo (). frame (0);
    	Log.info("Cambio de Iframe ok");
    	
    	WebElement frame3 = driver.findElement(By.name("Error Pages"));

    	// switch to frame 3
    	driver.switchTo().frame(frame3);
    	driver.findElement(By.xpath("/html/body/a[1]")).click();
    	
   
    	
    	
    }
    
    public void verificarTest() throws Exception {
		   
    	String Actualtext;
    	Actualtext = driver.findElement(By.xpath("/html/body/h2")).getText();
    	Assert.assertEquals(Actualtext,"Sahi Tests");
        }

    }


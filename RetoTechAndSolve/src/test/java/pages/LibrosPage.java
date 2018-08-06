/** ================================================================================================================
* @author  : Mariana Alzate 
* @version : 1.0 2018/08/03
* ==================================================================================================================
* 
* Clase  para la referenciacion de objetos de los Steps: AgregarLibros_Steps para la ejecucion de la feature 
* Agregar Libros, mediante la implementaciòn de Pagefactory
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

import utils.BaseClass;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;


public class LibrosPage extends BaseClass {
	
	
	 /**
     * Anotacion de Pagefactory  para almacenar en caché el elemento una vez que está ubicado
     */	
@CacheLookup



	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 * @param cantidad El parámetro cantidad define el número de libros a agregar 
	 */	
	@FindBy(how = How.XPATH, using = ".//*[@id='listing']/tbody/tr[2]/td[4]/input") WebElement txtCoreJava;
	public void setCoreJava(String cantidad) throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		txtCoreJava.clear();
		txtCoreJava.sendKeys(cantidad);
    }
	
	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 * @param cantidad El parámetro cantidad define el número de libros a agregar 
	 */	

	@FindBy(how = How.XPATH, using = ".//*[@id='listing']/tbody/tr[3]/td[4]/input") WebElement txtRubyforRails;
	public void setRubyforRails(String cantidad) throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		txtRubyforRails.clear();
		txtRubyforRails.sendKeys(cantidad);
    }
	
	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 * @param cantidad El parámetro cantidad define el número de libros a agregar 
	 */	
	@FindBy(how = How.XPATH, using = ".//*[@id='listing']/tbody/tr[4]/td[4]/input") WebElement txtPython;
	public void setPython(String cantidad) throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		txtPython.clear();
		txtPython.sendKeys(cantidad);
    }

	/**
	 * Metodo para inicializar objeto y ejercer accion sobre el
	 */	
	@FindBy(how = How.XPATH, using = ".//*[@id='available']/input[1]") WebElement btnAdd;
	public void ClickAdd() throws Exception {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
		btnAdd.click();
		Log.info("Se han agregado libros a Canasta");
		
    }
	
	
	@FindBy(how = How.ID, using = "total") WebElement txttotal;
    public void verificarTest( ) throws Exception {
    	
    	
    	String Actualtext;
    	//Actualtext = driver.findElement(By.id("total"));
    			
    	//int total = Integer.parseInt(Actualtext.getText());
    	//System.out.println("actualtext es:: "+Actualtext);
    	//int total= Integer.parseInt(Actualtext);
    	//System.out.println("After Convert String to int using Integer.parseInt() :: "+total);
    	//Assert.assertEquals(total, 2300);
    
    	
    	
           }

    }


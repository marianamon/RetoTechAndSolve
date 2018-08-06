package stepDefinition;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Log;
import utils.BaseClass;


public class Comunes_Steps {
	

	BaseClass claseBase = new BaseClass();
	
	 protected WebDriver driver;
	 private static String fileSeperator = System.getProperty("file.separator");
	
	public Comunes_Steps() throws MalformedURLException {
    }

	 @Given("^Que he ingresado a la pagina \"(.*)\"$")
	    public void navigateTo(String url) throws MalformedURLException{
	    	claseBase.getDriver(url);
	
	 }

	
}


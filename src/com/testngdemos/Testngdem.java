package com.testngdemos;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdem {

     WebDriver d;
     WebElement wb;
     
     //d.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	
	//@SuppressWarnings("deprecation")

     
     @Test
	public void MybeforeMethod() {
		System.setProperty("webdriver.chrome.driver","C://WEBDRIVERS/chromedriver.exe");
		d=new ChromeDriver();
       d.manage().window().maximize();
       
       //d.manage().timeouts().pageLoadTimeout(Duration.ofMillis(2000));
       //d.manage().deleteAllCookies();
       
       System.out.println("Before method");
	}

	@Test(dependsOnMethods="MybeforeMethod")
	public void Testngdemoex() {
		//Assert.assertTrue(false);
		d.get("https://developer.arm.com/architectures/instruction-sets/intrinsics/");
		
	}
	
	@Test(dependsOnMethods="Testngdemoex")
	public void Testngdemoex2() {
	
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		JavascriptExecutor jse=(JavascriptExecutor)d;
		wb=(WebElement)jse.executeScript("return document.querySelector('ads-global-navigation').shadowRoot.querySelector('svg')");
		wb.click();
		
	}	
	
	@Test(dependsOnMethods="Testngdemoex2")
	public void Testngdemoex3() {
		//wb.click();
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		JavascriptExecutor jse=(JavascriptExecutor)d;
		
		WebElement wb1=(WebElement)jse.executeScript("return document.querySelector('ads-global-navigation').shadowRoot.querySelector('ads-search').shadowRoot.querySelector('input')");
		
		String js="arguments[0].setAttribute('value','sandeep')";
		((JavascriptExecutor)d).executeScript(js,wb1);
		wb1.sendKeys(Keys.ENTER);
	
		System.out.println("test3");
	}

	
	}


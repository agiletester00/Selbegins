
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowdomdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://WEBDRIVERS/chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://developer.arm.com/architectures/instruction-sets/intrinsics/");
		
			
		JavascriptExecutor jse=(JavascriptExecutor)d;
		WebElement wb=(WebElement)jse.executeScript("return document.querySelector('ads-global-navigation').shadowRoot.querySelector('svg')");
		wb.click();
		WebElement wb1=(WebElement)jse.executeScript("return document.querySelector('ads-global-navigation').shadowRoot.querySelector('ads-search').shadowRoot.querySelector('input')");
		
		String js="arguments[0].setAttribute('value','input')";
		((JavascriptExecutor)d).executeScript(js,wb1);
		
		
		
		
		
		
		
		
		/*
		 * WebElement shroot=(WebElement)
		 * js.executeScript("arguments[0].shadowRoot",host);
		 * 
		 * 
		 * 
		 * 
		 * WebElement
		 * r1=shroot.findElement(By.cssSelector("#ads:navigation:developerGlobalNav"));
		 * WebElement r2=r1.findElement(By.cssSelector(".c-navigation__bar"));
		 * WebElement r3=r2.findElement(By.
		 * cssSelector(".c-navigation__bar__section u-flex u-justify-content-end"));
		 * WebElement r4=r3.findElement(By.
		 * cssSelector(".c-navigation-search u-hide xl:u-display-flex")); WebElement
		 * r5=r4.findElement(By.cssSelector(".c-navigation-actions")); WebElement
		 * r6=r5.findElement(By.cssSelector(".c-navigation-actions__items")); WebElement
		 * r7=r6.findElement(By.cssSelector(".c-navigation-actions__item")); WebElement
		 * r8=r7.findElement(By.cssSelector(".c-navigation-action xl-up")); WebElement
		 * r9=r8.findElement(By.cssSelector(".c-navigation-action__icon"));
		 * r9.findElement(By.tagName("svg")).click();
		 * 
		 * //WebElement r12=r11.findElement(By.cssSelector(""));
		 	
		
		
		
		
		shroot.findElement(By.cssSelector("#developerGlobalNav:tab:search-view")).click();
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

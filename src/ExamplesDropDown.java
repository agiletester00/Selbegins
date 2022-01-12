import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ExamplesDropDown {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver","C:/WEBDRIVERS/chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		d.findElement(By.id("autosuggest")).sendKeys("in");
		
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
		
		List<WebElement> wbl=d.findElements(By.cssSelector(".ui-menu-item a"));
		
		for(WebElement s:wbl)
		{
			if(s.getText().equalsIgnoreCase("India"))
			{
				s.click();
				break;
			}
		}
		
		System.out.println(d.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		d.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		System.out.println(d.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		
		
		
		
		
		
		
			
		
	
		WebElement wb=d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select opt=new Select(wb);
		
		opt.selectByIndex(3);
	     String s=opt.getFirstSelectedOption().getText();
	     System.out.println(s);
	     
		
		opt.selectByValue("AED");
		System.out.println(opt.getFirstSelectedOption().getText());
		//List<WebElement> i=opt.getOptions();
		d.findElement(By.id("divpaxinfo")).click();
		
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		for(int i=1;i<5;i++)
			d.findElement(By.id("hrefIncAdt")).click();
	
		d.findElement(By.id("btnclosepaxoption")).click();
	    
		Assert.assertEquals(d.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
		
		
		
		System.out.println("Pass");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

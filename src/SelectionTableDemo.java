import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectionTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://WEBDRIVERS//chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		
		WebDriver d = new ChromeDriver(options);

		// for any elements to appear while clicking
		d.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

		// Getting the URL
		d.get("https://developer.arm.com/architectures/instruction-sets/intrinsics/");
		List<WebElement> thc = d.findElements(By.xpath("//thead/tr/th"));

		// Get all td elements of First and Click any one of them
		List<WebElement> td = d.findElements(By.xpath("//tr/td"));

		int m = 0, k = 0;
		int a = thc.size();
		System.out.println("Total number of columns are " + a);
		int b = td.size();
		int c = b / a;
		System.out.println("The Total number of rows are " + c);
		/*
		 * for(;m<b;m++) { if(m>0 && m%a==0)
		 * 
		 * { k++;
		 * 
		 * } If first element has to be clicked then remove loop and execute in blocked
		 * code JavascriptExecutor jsc= (JavascriptExecutor)d;
		 * jsc.executeScript("arguments[0].click()",td.get(m));
		 * 
		 * //String s=td.get(m).getText();
		 * if(td.get(m).getText().equalsIgnoreCase("[__arm_]vddupq[_wb]_u16")) {
		 * 
		 * System.out.println(td.get(m).getText());
		 * System.out.println("The name is at "+(k+1)+" row in the table");
		 * JavascriptExecutor js= (JavascriptExecutor)d;
		 * js.executeScript("arguments[0].click()",td.get(m));
		 * 
		 * break; }
		 * }
		 */

		JavascriptExecutor jsc = (JavascriptExecutor) d;
		jsc.executeScript("arguments[0].click()", td.get(0));

		d.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement td1 = d.findElement(By.xpath("//section/div[text()='Description']/following-sibling::div"));
		System.out.println(td1.getText());

	}

}

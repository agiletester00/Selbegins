import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/WEBDRIVERS/chromedriver.exe");
		
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				WebDriver d = new ChromeDriver(options);
				d.get("https://www.nike.com/in/");
				
				
				System.out.println(d.getTitle());
				
		
		
	}

}

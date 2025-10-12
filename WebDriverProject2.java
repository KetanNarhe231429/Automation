//Q..Write a script for the following: 
// Open the browser 
// Delete all cookies 
// Set size of the window 
// Set position of the window 
// Maximize the window 


import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProject2 {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		 Set<Cookie> cookiesBefore = driver.manage().getCookies();
	        System.out.println("Cookies before deletion:");
	        for (Cookie cookie : cookiesBefore) {
	            System.out.println(cookie.getName() + " = " + cookie.getValue());
	    }
	        
		driver.manage().deleteAllCookies();
		
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
		Point p=new Point(250,250);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.close();
		driver.quit();

		
		
		
		
		
	}

}

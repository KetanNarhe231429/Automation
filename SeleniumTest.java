import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
                                     
public class SeleniumTest {
                               
public static void main(String[] args) {
		
	  
	
	
		WebDriverManager.chromedriver().setup();
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://google.com");
		driver.close();
		driver.quit();
	    
	
	    WebDriverManager.firefoxdriver().setup();
	    WebDriver driver1 =new FirefoxDriver();
	    driver1.get("https://youtube.com");
	    driver1.close();
	    driver1.quit();
	
	    
	    WebDriverManager.edgedriver().setup();
	    WebDriver edge = new EdgeDriver();
	    edge.get("https://instagram.com");
        edge.quit();
        
        WebDriverManager.iedriver().setup();
	    WebDriver driver3 = new InternetExplorerDriver();
	    driver3.get("https://instagram.com");
        driver3.quit();
        
      
	    
        
	    
	 
	    
	    
	    
}
}

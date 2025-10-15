import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActionsAllKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium Webdriver");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		searchbox=driver.findElement(By.name("q"));
		
		searchbox.sendKeys("Tab Example");
	    searchbox.sendKeys(Keys.TAB);
	    Thread.sleep(1000);
	    
	    searchbox.sendKeys(Keys.ESCAPE); 
        Thread.sleep(2000);
	    
        searchbox.clear();
        
        searchbox.sendKeys("Selenium");
        searchbox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        
        searchbox.sendKeys(Keys.ARROW_UP);
        Thread.sleep(1000);
        
        searchbox.sendKeys(Keys.CONTROL,"ac");
        Thread.sleep(1000);
        searchbox.clear();
        
        searchbox.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(1000);
        searchbox.clear();
        
        searchbox.sendKeys(Keys.SHIFT+"Selenium Test");
        Thread.sleep(1000);
        
        searchbox.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        
        searchbox.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        searchbox.clear();
        
        searchbox.sendKeys("Learning");
        searchbox.sendKeys(Keys.SPACE);
        searchbox.sendKeys("Automation");
        Thread.sleep(1000);
        
        searchbox.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
        
        
        
        
        
        
        
        
	    
	    
	    
	    
		
		
		
		

	}

}

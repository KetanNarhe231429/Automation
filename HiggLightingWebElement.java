import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class HiggLightingWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://adactin.com/HotelApp/index.php");
        
        JavascriptExecutor j=( JavascriptExecutor)driver;
        
        WebElement username= driver.findElement(By.id("username"));

        j.executeScript("arguments[0].setAttribute('style','background: green;border: solid 2px red');", username); 
        username.sendKeys("Ketan");
        		
  		WebElement password = driver.findElement(By.id("password")); 
        		 
        j.executeScript("arguments[0].setAttribute('style','background: green; border: solid 2px red');", password); 
        password.sendKeys("Ketan@29"); 
        		 
        Thread.sleep(2000);
        
        WebElement login = driver.findElement(By.id("login")); 
        j.executeScript("arguments[0].setAttribute('style','background: yellow;border: solid 2px green');", login); 
       
        login.click();
         
	}

}

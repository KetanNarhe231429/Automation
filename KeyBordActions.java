import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBordActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   

		   WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://adactin.com/HotelApp/index.php"); 
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("ketan");
		
		WebElement pass=driver.findElement(By.id("password"));
		    
		user.sendKeys(Keys.CONTROL,"ac");
		pass.sendKeys(Keys.CONTROL,"v");
		
		
		
	}

}

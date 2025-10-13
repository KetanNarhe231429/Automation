import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

		
		public static void main(String[] args) throws Throwable { 
			 
			 
			  WebDriver driver = new ChromeDriver(); 
			 
			  driver.get("https://adactin.com/HotelApp/index.php"); 
			 
			  driver.manage().window().maximize(); 
			 
			  WebElement x2 = driver.findElement(By.partialLinkText("Password?")); 
			   
			  x2.click(); 
			   
			   
			 
			

	}

}

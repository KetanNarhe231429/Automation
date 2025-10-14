import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckSameWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		
		driver.get("http://www.adactin.com/HotelApp/index.php"); 
	    WebDriver s1=driver;

		driver.findElement(By.id("username")).sendKeys("Ketan");
		driver.findElement(By.id("password")).sendKeys("Ketan@123");
		
		String s=driver.getCurrentUrl();
		
		if(s.equals(s1))
		{ 
			System.out.println("u r in adactin website"); 
			}
		   else
		   { 
			System.out.println("u r not in adactin website"); 
			
			}

		driver.quit();
	}

}

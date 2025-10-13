import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeAndGetTextMethods {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.adactin.com/HotelApp/index.php");
		
		
		driver.findElement(By.id("username")).sendKeys("ketan");
		driver.findElement(By.id("password")).sendKeys("ketan@29");
		
		
		String s=driver.findElement(By.id("username")).getAttribute("value");
		String s1=driver.findElement(By.id("password")).getAttribute("value");
		
		System.out.println("Username value "+s);
		System.out.println("Password value "+s1);
		driver.quit();
		
		
		}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/index.php"); 
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement forgotLink=driver.findElement(By.linkText("Forgot Password?"));
		forgotLink.click();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}

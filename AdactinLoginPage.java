import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactinLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.adactin.com/HotelApp/index.php"); 
		
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("Ketan");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("ketan@1234");

		System.out.println("UserName is "+user.getAttribute("value"));
		System.out.println("Passwor is "+pass.getAttribute("value"));
		
		WebElement log=driver.findElement(By.id("login"));
		log.click();
		
        driver.quit();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isDisplayedMethod {

	public static void main(String[] args){
		
	
	
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		try
		{
		WebElement logo = driver.findElement(By.xpath("//img[contains(@alt,'Facebook')]"));
		
		if (logo.isDisplayed())
		{
			System.out.println("Logo is availabele");
			
		}
		else
		{
			System.out.println("Log not avilable");
		}
		}
		catch(Exception e)
		{
			System.out.println("Logo element not found");

		}
		driver.quit();
		}
			


}

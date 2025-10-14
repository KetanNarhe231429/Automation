import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWikipadiaAvailabel {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/"); 

		// Locate Google logo using XPath
		boolean logo = driver.findElement(By.xpath("//div[@class='central-textlogo']")).isDisplayed();

		if (logo == true) 
		{
			System.out.println("Google logo is available");
		}
		else
		{
			System.out.println("Google logo is not available");
		}

		driver.quit();

	}

}

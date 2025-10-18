import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts"); 
		
		// Click the "Click me" button for prompt box
		driver.findElement(By.id("promtButton")).click(); 
		
		// Switch to alert
		Alert a = driver.switchTo().alert(); 
		
		// Print alert text
		System.out.println(a.getText());
		
		// Enter text into the prompt alert
		a.sendKeys("yes");
		
		Thread.sleep(1000);
		
		// Cancel the alert (you can also use a.accept() for OK)
		a.dismiss();
		
		Thread.sleep(1000);
		
		driver.quit();
	}
}

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Confirm {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/"); 
		driver.findElement(By.xpath(".//button[text()='Confirm Pop up']")).click();

		Alert a =driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		driver.quit();
	}

}

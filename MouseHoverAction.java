
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize(); 
		  driver.get("http://www.greenstechnologys.com/"); 
		  
		 WebElement course= driver.findElement(By.linkText("COURSES"));
		 
		 Actions a=new Actions(driver);
		 a.moveToElement(course).perform();
		 
		 Thread.sleep(1000);
		 
		 WebElement demo=driver.findElement(By.xpath("//span[text()='DevOps Training']"));
		 
		 a.click(demo).perform();
	}
	
}

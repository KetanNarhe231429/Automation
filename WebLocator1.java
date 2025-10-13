import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocator1 {

	public static void main(String[] args)  throws Throwable {
		
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://adactinhotelapp.com/");
         Thread.sleep(2000);
        
         
         WebElement x= driver.findElement(By.id("username"));
         x.sendKeys("Ketan");
         Thread.sleep(2000);
         
         driver.navigate().to("https://google.com");
         Thread.sleep(2000);
         
         
         driver.navigate().back();
         Thread.sleep(2000);
         
         
         WebElement x1=driver.findElement(By.name("password"));
         x1.sendKeys("ketan@12345");
         Thread.sleep(2000);
        
         driver.navigate().forward();
         Thread.sleep(2000);
         
         driver.navigate().back();
         Thread.sleep(2000);
         
         driver.navigate().refresh();
         Thread.sleep(2000);
       
         
         
         WebElement x2=driver.findElement(By.id("login"));
         x2.click();
         Thread.sleep(2000);
         driver.quit();
         
	}

}

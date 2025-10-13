import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocatorAndNavigationCommand {

	public static void main(String[] args) throws InterruptedException {
		

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://adactinhotelapp.com/");
        Thread.sleep(2000);
       
        WebElement x=driver.findElement(By.id("username"));
        x.sendKeys("ketannarhe");
        Thread.sleep(2000);
        
        WebElement x1=driver.findElement(By.name("password"));
        x1.sendKeys("Ketan@12345");
        Thread.sleep(2000);
        
        driver.navigate().to("http://www.google.com");
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);
        
        Dimension d=new Dimension(550,500);
        driver.manage().window().setSize(d);
        Thread.sleep(2000);
        
      
        
        Point p=new Point(250, 250);
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);
        
        
        driver.quit();
        
        
        
        
        
        
        
        

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedinLogin {

    public static void main(String[] args) throws InterruptedException {
      
        
      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.linkedin.com/login");

        
        driver.findElement(By.id("username")).sendKeys("Ketannarhe02@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Ketan@29");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

      
        Thread.sleep(5000);
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUpXPat {

    public static void main(String[] args) throws InterruptedException {

      
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      
        driver.get("https://www.facebook.com/reg/");
        Thread.sleep(1000);

        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Ketan");
        Thread.sleep(1000);
        
        WebElement LastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        LastName.sendKeys("Narhe");
        Thread.sleep(1000);
       
 
        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("ketannarhe02@gmail.com");
        Thread.sleep(1000);
        
        WebElement RegEmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        RegEmail.sendKeys("ketannarhe02@gmail.com");
        Thread.sleep(1000);
        
         driver.quit();
        
        
      
    }
}

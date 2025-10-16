import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookERegistratin {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.facebook.com/reg/");

        
        Thread.sleep(3000);

       
        driver.findElement(By.name("firstname")).sendKeys("Narhe");
        driver.findElement(By.name("lastname")).sendKeys("Ketan");
        driver.findElement(By.name("reg_email__")).sendKeys("ketannarhe02@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("ketan123@");

        
        WebElement w1 = driver.findElement(By.xpath("//*[@id='day']"));
        Select s1 = new Select(w1);
        s1.selectByValue("29"); 

        WebElement w2 = driver.findElement(By.xpath("//*[@id='month']"));
        Select s2 = new Select(w2);
        s2.selectByValue("3"); 

        WebElement w3 = driver.findElement(By.xpath("//*[@id='year']"));
        Select s3 = new Select(w3);
        s3.selectByValue("2002");  

       
        driver.findElement(By.xpath("//input[@value='2']")).click();

        
        // driver.findElement(By.name("websubmit")).click();

        // Wait a bit to see the result
        Thread.sleep(3000);

        // Close browser
        driver.quit();
    }
}

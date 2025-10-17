import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooRegistration {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
        driver.get("https://login.yahoo.com/account/create?specId=yidReg&altreg=0&intl=in&.done=https://mail.yahoo.com");

        driver.findElement(By.id("usernamereg-firstName")).sendKeys("Narhe");
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("Ketan");
        
        driver.findElement(By.id("usernamereg-yid")).sendKeys("ketannarhe02@gmail.com");
        driver.findElement(By.id("usernamereg-password")).sendKeys("Ketan@29");
        driver.findElement(By.id("usernamereg-phone")).sendKeys("9322859427");
        
        WebElement month=driver.findElement(By.id("usernamereg-month"));
        
        Select s=new Select(month);
        s.selectByValue("3");
        
        driver.findElement(By.id("usernamereg-day")).sendKeys("29");
        driver.findElement(By.id("usernamereg-year")).sendKeys("2002");
        
        driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("male");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("reg-submit-button")).click();
        
        Thread.sleep(2000);
        
        driver.quit();
        

	}

}

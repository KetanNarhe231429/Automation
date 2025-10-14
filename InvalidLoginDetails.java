import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginDetails {


	    public static void main(String[] args) throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://practicetestautomation.com/practice-test-login/");

	        driver.findElement(By.id("username")).sendKeys("ketan");
	        driver.findElement(By.id("password")).sendKeys("Password123");
	        driver.findElement(By.id("submit")).click();

	        Thread.sleep(2000);

	     
	        boolean msg = driver.findElement(By.xpath("//div[contains(@id,'error')]")).isDisplayed();

	        if (msg==true) {
	            System.out.println("Invalid login message displayed");
	        } else {
	            System.out.println(" Invalid login message not displayed");
	        }

	        driver.quit();
	    }
	}

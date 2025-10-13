import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isSelected {

	    public static void main(String[] args) {

	       
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/"); 

	        try {
	            WebElement loginButton = driver.findElement(By.name("login"));
	            loginButton.click();

	            if(loginButton.isSelected()) {
	                System.out.println("Login button is visible and clickable");
	            } else {
	                System.out.println("Login button is not available");
	            }

	        } catch(Exception e) {
	            System.out.println("Element not found or not clickable");
	        }

	        driver.quit();
	    }
	}

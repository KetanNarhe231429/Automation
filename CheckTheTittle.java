import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckTheTittle {
    public static void main(String[] args) {
    	
       
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.google.co.in/");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
        
    }
}

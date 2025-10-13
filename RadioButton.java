import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

    public static void main(String[] args) { 

        WebDriver driver = new FirefoxDriver(); 
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button"); 

        // Locate the radio button
        WebElement radiobutton = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        
        // Click the radio button
        radiobutton.click();

        System.out.println("Yes Radio Button Clicked Successfully!"+radiobutton);
      
        driver.quit();
    }
}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver(); 

        driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
        WebElement w = driver.findElement(By.name("coffee2"));

        Select s = new Select(w);          
         
        // Select options by visible text
        s.selectByVisibleText("Sugar");
        s.selectByVisibleText("Honey");

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        // Deselect options by visible text
        s.deselectByVisibleText("Sugar");
        s.deselectByVisibleText("Honey");

        driver.quit();
    }
}

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintRadioButton {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");
        
        
        List<WebElement> radioButtons = driver.findElements(By.xpath("//div[@class='custom-control']/label"));
        
        System.out.println("Available Radio Buttons:");
        for (WebElement rb : radioButtons) {
            System.out.println(rb.getText());
        }

        Thread.sleep(2000);
        driver.quit();
    }
}

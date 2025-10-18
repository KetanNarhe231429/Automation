import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class PageDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");

        // Create JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Find the element "Live Demo"
        WebElement liveDemo = driver.findElement(By.xpath("//*[text()='Live Demo']"));

        // Scroll the page to the element
        js.executeScript("arguments[0].scrollIntoView(true);", liveDemo);

        Thread.sleep(2000); // Wait to see the scroll
        driver.quit();
    }
}

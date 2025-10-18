import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollDownUp10Times {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down 10 times
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 800)");
            Thread.sleep(500);
        }

        Thread.sleep(1000);

        // Scroll up 10 times
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -800)");
            Thread.sleep(500);
        }

        driver.quit();
    }
}

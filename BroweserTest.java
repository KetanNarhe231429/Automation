import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BroweserTest
{
    public static void main(String[] args) {
 
    	
    	WebDriver driver1=new ChromeDriver();
    	driver1.get("https://www.gmail.com/");
        
    	WebDriver driver=new FirefoxDriver();
    	 driver.get("https://www.selenium.dev/");
    	
    	
    	 //WebDriver driver2=new InternetExplorerDriver();
    	 //driver2.get("https://www.selenium.dev/");
                                       	
    }
}











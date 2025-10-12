import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver(); 
 		driver.get("https://www.gmail.com/");
  	    driver.manage().window().maximize();

		
			
	}

}

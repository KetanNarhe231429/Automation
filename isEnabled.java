import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isEnabled {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/"); 
		
		boolean logo=driver.findElement(By.xpath("//*[@id='email']")).isEnabled();
		
		if(logo==true)
		{
			System.out.println("TextBox is enamble to print");
		}
		else
		{
			System.out.println("Not enabled");
		}
		
		 driver.quit();

	}

}

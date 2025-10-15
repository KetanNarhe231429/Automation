import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValues {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		 
		  driver.get("https://adactin.com/HotelApp/index.php"); 
		 
		  driver.manage().window().maximize(); 
		 
		  WebElement x =driver.findElement(By.xpath("//td[@class='build_title']"));

		  String x1=x.getCssValue("font-size");
		  System.out.println(x1);
		  
		  String x2=x.getCssValue("color");
		  System.err.println(x2);
		  
		  String x3=x.getCssValue("font-weight");
		  System.out.println(x3);
		  
		  String x4=x.getCssValue("font-family");
		  System.out.println(x4);
		  
		  String x5=x.getCssValue("background");
		  System.out.println(x5);
		  
		  driver.quit();
	}

}

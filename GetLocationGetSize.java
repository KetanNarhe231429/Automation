import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationGetSize {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
	    WebElement un=driver.findElement(By.id("username"));

	        Dimension s=un.getSize();
	        int h=s.getHeight();
	        int w=s.getWidth();
	        
	        System.out.println("Hight"+h);
	        System.out.println("width"+w);
	        
	        Point l=un.getLocation();
	        int x=l.getX();
	        int y=l.getY();
	        
	        System.out.println("X-axis"+x);
	        System.out.println("Y-axis"+y);
	        
	        Thread.sleep(1000);
	        
	        driver.quit();
	}

}

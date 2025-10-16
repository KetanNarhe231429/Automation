import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
       
		WebElement w=driver.findElement(By.name("coffee"));
        
        Select s=new Select(w);
        
        boolean b=s.isMultiple();
        
        System.out.println(b);
		
	}

}

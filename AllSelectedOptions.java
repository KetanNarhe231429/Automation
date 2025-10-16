import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOptions {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
		 WebElement w = driver.findElement(By.name("coffee"));
		 
		 Select s=new Select(w);
		 
		 List<WebElement>web= s.getAllSelectedOptions();
		 
		 for(WebElement x:web)
		 {
			 System.out.println(x.getText());
		 }

	}

}

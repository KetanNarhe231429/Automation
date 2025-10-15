import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
		WebElement w = driver.findElement(By.name("coffee")); 
		
		Select s=new Select(w); 
		List<WebElement> o = s.getOptions(); 
		for (WebElement x:o) { 
		System.out.println(x.getText()); 
		} 
	
	}

}

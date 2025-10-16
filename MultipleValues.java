import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm"); 
       
		WebElement w=driver.findElement(By.name("coffee"));
        
        Select s=new Select(w);
        
        boolean b=s.isMultiple();
        
        System.out.println("Is Dropdown multiple selected" +b);
        
        WebElement selectedOptions=s.getFirstSelectedOption();
        
        System.out.println("Currently selected options"+selectedOptions.getText());
        
        
        System.out.println("All Available Options");
        
        for(WebElement option:s.getOptions())
       {
         System.out.println(option.getText());   	
       }
        
		driver.quit();
	}

}

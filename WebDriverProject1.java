import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProject1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		
		 String title=driver.getTitle();
		 System.out.println("Title"+title);

		 String url=driver.getCurrentUrl();
	     System.out.println("Current url"+url);
	     
	     Thread.sleep(3000);
	     driver.close();     
	}
	

}

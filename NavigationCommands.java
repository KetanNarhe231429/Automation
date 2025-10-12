import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Open Google");
		
		
		driver.navigate().to("https://www.wikipedia.org");
		System.out.println("Open Wikipadia");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.manage().deleteAllCookies();
		
		//driver.close();
		driver.quit();
		
		

	}

}

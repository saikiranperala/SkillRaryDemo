package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetions2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src\\main\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("APjFqb")).sendKeys("pants");
	    List<WebElement> autosuggetions = driver.findElements(By.xpath("//span[text()='pants']"));
	    
	    for(int i=0;i<autosuggetions.size();i++)
	    {
	    	String text=autosuggetions.get(i).getText();
	    	System.out.println(text);
	    }
	    driver.close();
	}

}

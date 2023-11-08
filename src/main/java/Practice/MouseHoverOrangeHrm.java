package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOrangeHrm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Actions a=new Actions(driver);
		
		WebElement company = driver.findElement(By.xpath("//a[text()='Company']"));
		
		a.moveToElement(company).perform();
		driver.findElement(By.xpath("//li/a[text()='About Us']")).click();
		
		driver.close();
		
		
		
		
		
		
		
	}
	

}

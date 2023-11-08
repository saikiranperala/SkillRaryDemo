package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement men = driver.findElement(By.id("men"));
		
		Actions a=new Actions(driver);
		a.moveToElement(men).perform();
		
		
		driver.findElement(By.id("//a[text()='Jackets']")).click();
		Thread.sleep(4000);
		
		if(driver.getTitle().contains("jackets"))
		{
			System.out.println("passes");
		}
		else {
			System.out.println("fail");
		}
		driver.close();
		
	}

}

package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement courseTab = driver.findElement(By.id("course"));
		
		Actions a=new Actions(driver);
		a.moveToElement(courseTab).perform();
		driver.findElement(By.xpath("//div/h1[text()='DevOps']")).click();
		Thread.sleep(2000);
		
		WebElement plusButton = driver.findElement(By.id("add"));
		
		a.doubleClick(plusButton).perform();
		
		
		driver.close();
		
		
		
		
		
	}

}

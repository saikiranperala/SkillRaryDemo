package specialClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("saikiran");
		driver.findElement(By.id("LastName")).sendKeys("perala");
		driver.findElement(By.id("Email")).sendKeys("peralasaikiran200@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Saikiran@123");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Saikiran@123");
		driver.findElement(By.id("register-button")).click();
		
		
		
		
	}

}

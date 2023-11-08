package skillrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//a[text()='LOGIN']")
	private WebElement loginButton;
	

	@FindBy(id="email")
	private WebElement emailTF;
	
	@FindBy(id="password")
	private WebElement passwordTF;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkBox;
	
	@FindBy(id="last")
	private WebElement loginButton2;
	
	//initialization
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public void setloginbutton()
	{
		loginButton.click();
	}
	public void emailTF()
	{
		emailTF.sendKeys("admin");
	}
	public void setpasswordTF() {
		passwordTF.sendKeys("admin");
	}
	
	public void clickcheckBox()
	{
		checkBox.click();
	}
	public void clickloginButton()
	{
		loginButton2.click();
	}
	

}

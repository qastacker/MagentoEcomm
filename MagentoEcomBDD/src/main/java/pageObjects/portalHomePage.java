package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class portalHomePage {

	
	public WebDriver driver;
	
	By userName=By.xpath("//div[@class='panel header']//span[@class='logged-in'][contains(text(),'Welcome, tester tester!')]");
	
	public portalHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getByUserName()
	{
		return driver.findElement(userName);
	}
	
	
	
}

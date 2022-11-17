package seleniumPractice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import junit.framework.Assert;

public class LoginVerifyEdge {
	
	@Test
	public void Launch() throws InterruptedException {
		
		//Chrome Launch
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//Login
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
		
		//Validation
		String actualUrl= driver.getCurrentUrl();
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList", actualUrl);
		
		boolean PIMdisplayed = driver.findElement(By.tagName("h6")).isDisplayed();
		Assert.assertTrue(PIMdisplayed);
		System.out.println("PIM Displayed: " + PIMdisplayed);
		
		//Logout
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
		boolean LoginButton = driver.findElement(By.tagName("button")).isDisplayed();
		Assert.assertTrue(LoginButton);
		System.out.println("Login Page Available: " + LoginButton);
		
		//Close
		Thread.sleep(2000);
		driver.close();
		
		
	}

}

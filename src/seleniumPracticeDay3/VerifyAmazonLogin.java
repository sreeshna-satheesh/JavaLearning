package seleniumPracticeDay3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class VerifyAmazonLogin {

	@Test
	public void LoginSteps() throws InterruptedException {
		
		//System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
	
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String searchItem = "iphone14";
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		String URL = driver.getTitle();
		
		System.out.println(URL);
		
		Assert.assertEquals("Amazon.in : "+searchItem, URL);
		
		Assert.assertTrue(URL.contains(searchItem));
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	
	}
}

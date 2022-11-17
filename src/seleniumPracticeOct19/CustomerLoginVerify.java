package seleniumPracticeOct19;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CustomerLoginVerify {
	
	@Test
	public void LoginVerify() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement a = driver.findElement(By.xpath("//input[contains(@class,'email')]"));
		
		a.clear();
		
		a.sendKeys("admin@yourstore.com");
		
		WebElement b = driver.findElement(By.cssSelector("input#Password"));
		
		b.clear();
		
		b.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[contains(text(),'Customers')]")).click();
		
		driver.findElement(By.cssSelector("a[href='/Admin/Customer/List']")).click();
		
		String pageTitle = driver.getTitle();
		
		System.out.println("PageTitle is: " + pageTitle);
		
		Assert.assertEquals("Customers / nopCommerce administration", pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		
		System.out.println("PageUrl is: " + pageUrl);
		
		Assert.assertEquals("https://admin-demo.nopcommerce.com/Admin/Customer/List",pageUrl);
		
		String title = driver.findElement(By.xpath("//h1[contains(text(),'Customers')]")).getText();
		
		System.out.println("Heading is: " + title);
		
		Assert.assertEquals("Customers",title);
		
		driver.close();
		
		
		
	}

}

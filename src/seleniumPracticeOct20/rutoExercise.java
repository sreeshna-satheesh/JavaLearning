package seleniumPracticeOct20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rutoExercise {
	WebDriver driver;

	@BeforeTest

	public void launchApp() throws Exception {

		System.out.println("launch app.....");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}
	
	
	@Test
	
	public void testApp() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.findElement(By.cssSelector("input#Email")).clear();
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
	}
	
	@AfterTest

    public void closeApp() throws Exception {

        

        Thread.sleep(4000);

        driver.close();

        System.out.println("closing app.....");

    }
}

package seleniumPractice;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
public class EdgeLogin {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\Student\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	//System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
	System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
	
    driver = new EdgeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
    
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC01LoginPage() throws InterruptedException {
    driver.get("https://opensource-demo.orangehrmlive.com/");
    Thread.sleep(3000);
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector(".oxd-button")).click();
    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Logout")).click();
    assertThat(driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).getText(), is("Forgot your password?"));
    driver.findElement(By.cssSelector(".orangehrm-login-forgot-header")).click();
    driver.findElement(By.cssSelector(".oxd-button--ghost")).click();
  }
}

package seleniumPracticeOct19;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
public class HandleCheckBoxRadioButton extends BaseTest{
	
	@Test
	public void handleCheckbox() throws Exception {


    

    

    Thread.sleep(4000);

    driver.findElement(By.xpath("//input[@value=\"Car\"]")).click();

    

    //driver.findElement(By.xpath("//input[@value='Bike']")).click();

    System.out.println("test case1");
    
    
    driver.findElement(By.xpath("//input[@value='female']")).click();
    
    System.out.println("Test Case 2 ");

    

	}

    



}
